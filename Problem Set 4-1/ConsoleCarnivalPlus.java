import java.util.Scanner;

public class ConsoleCarnivalPlus {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //System.out.println(randomInt(5));
        //coinFlip();
        //rps();
        //m8b();
        menu();
    }

    public static int randomInt (int n)
    {
        return (int) (Math.random()*n +1);
    }

    public static void coinFlip()
    {
        int win = 0;
        int lose = 0;
        String replay = "yes";
        while(replay.equals("yes")||replay.equals("y")) {
            System.out.print("Call heads or tails: ");
            String f = sc.next();
            System.out.println("");
            System.out.println("OK, I'm flipping the coin!");
            int n = randomInt(2);
            String ans;
            if (n == 1)
                ans = "tails";
            else
                ans = "heads";

            System.out.println("I got: " + ans);
            if (ans.equals(f)) {
                win++;
                System.out.println("You Win!!!");
            }
            else {
                lose++;
                System.out.println("You Lose!!!");
            }

            System.out.println("Want to play again?");
            replay = sc.next();
        }
        System.out.println("You have "+win+" wins and "+lose+" losses.");
        System.out.println("Bye");
    }
    public static void rps()
    {
        int win = 0;
        int lose = 0;
        int tie = 0;
        String replay = "yes";
        while(replay.equals("yes")||replay.equals("y")) {

            System.out.println("You stupid human, lets have a battle of rock paper scissors!");
            System.out.print("Your choice: ");
            String h = sc.next();
            int comp = randomInt(3);
            if (comp == 3)
                System.out.println("OK, I choose Paper!");
            else if (comp == 2)
                System.out.println("OK, I choose Rock!");
            else
                System.out.println("OK, I choose Scissors!");

            int hu;
            if (h.equals("paper"))
                hu = 3;
            else if (h.equals("rock"))
                hu = 2;
            else
                hu = 1;
            if ((comp > hu) || (comp == 1 && hu == 3)) {
                lose++;
                System.out.println("HAHA You are weak. You are no match for me!!!");
            }
            else if (comp == hu) {
                tie++;
                System.out.println("You are lucky, next time you will get destroyed");
            }
            else {
                win++;
                System.out.println("NOOOOO!! How is this possible? How did you win??? You must be using hacks.");
            }

            System.out.print("Want to play again?");
            replay = sc.next();
        }
        System.out.println("You have "+win+" wins, "+lose+" losses, and "+tie+" ties.");
        System.out.println("Bye!");
    }

    public static void m8b()
    {
        String replay = "yes";
        while(replay.equals("yes")||replay.equals("y")) {
            System.out.println("I can see the future! Ask me a yes/no question: ");
            String s = sc.next();
            s = sc.nextLine();
            int n = randomInt(20);
            switch (n) {
                case 1:
                    System.out.println("It is certain.");
                    break;
                case 2:
                    System.out.println("It is decidedly so.");
                    break;
                case 3:
                    System.out.println("Without a doubt.");
                    break;
                case 4:
                    System.out.println("Yes, definitely.");
                    break;
                case 5:
                    System.out.println("You may rely on it.");
                    break;
                case 6:
                    System.out.println("As I see it, yes.");
                    break;
                case 7:
                    System.out.println("Most likely.");
                    break;
                case 8:
                    System.out.println("Outlook good.");
                    break;
                case 9:
                    System.out.println("Yes.");
                    break;
                case 10:
                    System.out.println("Signs point to yes.");
                    break;
                case 11:
                    System.out.println("Reply hazy, try again.");
                    break;
                case 12:
                    System.out.println("Better now tell you now.");
                    break;
                case 13:
                    System.out.println("Cannot predict now.");
                    break;
                case 14:
                    System.out.println("Concentrate and ask again.");
                    break;
                case 15:
                    System.out.println("Don't count on it.");
                    break;
                case 16:
                    System.out.println("My reply is no.");
                    break;
                case 17:
                    System.out.println("My sources say no.");
                    break;
                case 18:
                    System.out.println("Outlook not so good.");
                    break;
                case 19:
                    System.out.println("Very doubtful.");
                    break;
                default:
                    System.out.println("Ask again later");
            }

            System.out.print("Do you have another question?");
            replay = sc.next();
        }
        System.out.println("Bye!");
    }

    public static void diceRoller()
    {
        String s;
        int index;
        int times;
        int sides;
        int sum;
        int r;
        String replay = "";
        while(true)
        {
            System.out.print("Describe your dice roll: ");
            s = sc.next();
            if(s.equals("done"))
                break;

            index = s.indexOf("d");
            //System.out.println("Index is "+index);
            times = Integer.parseInt(s.substring(0,index));
            sides = Integer.parseInt(s.substring(index+1));

            sum = 0;
            r=0;

            System.out.print("Your roll: ");
            for(int i=0; i<times; i++)
            {
                r = (int)(Math.random()*sides+1);
                sum += r;
                System.out.print(r+", ");
            }
            System.out.println("Total = "+sum);
            System.out.print("Describe your dice roll");
        }
        System.out.println("Bye!");
    }

    public static void menu()
    {
        int mode = 6;
        while(mode != 5) {
            System.out.println("Welcome to the Console Carnival!");
            System.out.println("--------------------------------");
            System.out.println("Shall we play a game?");
            System.out.println("");
            System.out.println("1. Flip a coin");
            System.out.println("2. Rock, Paper, Scissors");
            System.out.println("3. Magic 8 Ball");
            System.out.println("4. Dice Roller");
            System.out.println("5. Quit");
            System.out.println("");
            System.out.println("What game would you like to play: ");
            mode = sc.nextInt();
            if (mode == 1)
                coinFlip();
            if (mode == 2)
                rps();
            if (mode == 3)
                m8b();
            if (mode == 4)
                diceRoller();
            if (mode == 5)
                break;
        }
        System.out.println("Bye!");
    }
}

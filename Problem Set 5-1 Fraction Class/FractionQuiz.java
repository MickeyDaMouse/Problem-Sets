import java.util.Scanner;

public class FractionQuiz {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Let the fraction quiz begin. Answers should be in lowest terms. Good Luck!");
        System.out.println();

        Fraction result = new Fraction(0,4);

        Fraction add1 = new Fraction();
        Fraction add2 = new Fraction();

        Fraction sub1 = new Fraction();
        Fraction sub2 = new Fraction();

        Fraction mul1 = new Fraction();
        Fraction mul2 = new Fraction();

        Fraction div1 = new Fraction();
        Fraction div2 = new Fraction();



        //add
        System.out.print(add1 + " + " + add2 + " = ");
        String a = sc.next();
        Fraction add = new Fraction(a);
        add1.add(add2);
        if(add.equals(add1))
        {
            System.out.println("Correct!");
            result.setNum(result.getNum()+1);
        }
        else System.out.println("Wrong! The correct answer is " + add1);
        System.out.println();

        //subtract
        System.out.print(sub1 + " - " + sub2 + " = ");
        String s = sc.next();
        Fraction sub = new Fraction(s);
        sub1.subtract(sub2);
        if(sub.equals(sub1))
        {
            System.out.println("Correct!");
            result.setNum(result.getNum()+1);
        }
        else System.out.println("Wrong! The correct answer is " + sub1);
        System.out.println();

        //multiply
        System.out.print(mul1 + " x " + mul2 + " = ");
        String m = sc.next();
        Fraction mul = new Fraction(m);
        mul1.multiply(mul2);
        if(mul.equals(mul1))
        {
            System.out.println("Correct!");
            result.setNum(result.getNum()+1);
        }
        else System.out.println("Wrong! The correct answer is " + mul1);
        System.out.println();

        //divide
        System.out.print(div1 + " / " + div2 + " = ");
        String d = sc.next();
        Fraction div = new Fraction(d);
        div1.divide(div2);
        if(div.equals(div1))
        {
            System.out.println("Correct!");
            result.setNum(result.getNum()+1);
        }
        else System.out.println("Wrong! The correct answer is " + div1);
        System.out.println();

        System.out.println("Your win/loss ratio was " + result + ", for a score of " + (result.toDouble()*100) +" percent!");


    }
}


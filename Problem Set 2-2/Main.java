//Problem Set 2-2
//Oct. 5th 2022
//Mickey Zhao

//Main class
public class Main {
    public static void main(String[] args) {
        //last letter
        System.out.println("EXERCISE 1 TEST CASES");
        System.out.print("lastLetter(\"Hello, World!\") returns ");
        System.out.println(lastLetter("Hello World!"));

        System.out.print("lastLetter(\"Hello\") returns ");
        System.out.println(lastLetter("Hello"));

        System.out.print("lastLetter(\"H\") returns ");
        System.out.println(lastLetter("H"));

        //non start
        System.out.println("EXERCISE 2 TEST CASES");
        System.out.print("nonStart(\"Hello\",\"World!\") returns ");
        System.out.println(nonStart("Hello","World!"));

        System.out.print("nonStart(\"Java\",\"Code\") returns ");
        System.out.println(nonStart("Java","Code"));

        System.out.print("nonStart(\"H\",\"I\") returns ");
        System.out.println(nonStart("H","I"));

        //middle three
        System.out.println("EXERCISE 3 TEST CASES");
        System.out.print("middleThree(\"Candy\") returns ");
        System.out.println(middleThree("Candy"));

        System.out.print("middleThree(\"Solving\") returns ");
        System.out.println(middleThree("Solving"));

        System.out.print("middleThree(\"ABC\") returns ");
        System.out.println(middleThree("ABC"));

        //swap last two
        System.out.println("EXERCISE 4 TEST CASES");
        System.out.print("swapLastTwo(\"Candy\") returns ");
        System.out.println(swapLastTwo("Candy"));

        System.out.print("swapLastTwo(\"GTA\") returns ");
        System.out.println(swapLastTwo("GTA"));

        System.out.print("swapLastTwo(\"OK\") returns ");
        System.out.println(swapLastTwo("OK"));

        System.out.println("EXERCISE 5 TEST CASES");
        System.out.print("frontAgain(\"edited\") returns ");
        System.out.println(frontAgain("edited"));

        System.out.print("frontAgain(\"edit\") returns ");
        System.out.println(frontAgain("edit"));

        System.out.print("frontAgain(\"ed\") returns ");
        System.out.println(frontAgain("ed"));

    }

    //last letter method
    public static String lastLetter(String str)
    {
        //returns the last letter
        return(str.substring(str.length()-1));
    }

    //non start method
    public static String nonStart(String s1, String s2)
    {
        //returns s1 + s2 with their beginning letter removed
        return(s1.substring(1)+s2.substring(1));
    }

    //middle three method
    public static String middleThree(String str)
    {
        return(str.substring(str.length()/2-1,str.length()/2+2));
    }

    //swap last two letters
    public static String swapLastTwo(String str)
    {
        String s1 = str.substring(str.length()-1); //get the last letter
        String s2 = str.substring(str.length()-2,str.length()-1);//get the second last letter

        //add the second last letter and last letter to the string without the last two letters
        return(str.substring(0,str.length()-2)+s1+s2);
    }

    //front again
    public static Boolean frontAgain(String str)
    {
        String s1 = str.substring(0,2); //gets the first 2 letters
        String s2 = str.substring(str.length()-2); //gets the last 2 letters
        return s1.equals(s2); //return the boolean directly by using .equals
    }
}

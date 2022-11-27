/**
 * This program is to create a class that represents a number as a fraction
 * Created Nov. 13th 2022
 * @author Mickey Zhao
 * @version 1.0
 */

public class Fraction {
    private int numerator;
    private int denominator;

    /**
     * the default fraction is 1/1
     */

    public Fraction() {
        numerator = (int) (Math.random()*9 + 1);
        denominator = (int) (Math.random() * 9 + 1);
        reduce();
    }

    /**
     * @param num - number to assign to numerator
     * @param den - number to assign to denominator
     */
    public Fraction(int num, int den) {
        numerator = num;
        if (den != 0) denominator = den;
        else {
            denominator = 1;
            System.out.println("Error: Denominator was zero. I changed it to one for you.");
        }
        reduce();
    }

    /**
     * Pre-Condition: the string parameter is a correct format in the form numerator/denominator
     * Post-Condition: the value of numerator and denominator is set and denominator != 0
     */
    public Fraction(String str) {
        numerator = Integer.parseInt(str.substring(0, str.indexOf("/")));
        denominator = Integer.parseInt(str.substring(str.indexOf("/") + 1));
        if (denominator == 0) {
            denominator = 1;
            System.out.println("Error: Denominator was zero. I changed it to one for you.");
        }
        reduce();
    }

    public Fraction(Fraction f) {
        numerator = f.numerator;
        denominator = f.denominator;
        //reduce();
    }

    /**
     * @return return the string representing the fraction in the form numerator/denominator
     */
    public String toString() {
        return numerator + "/" + denominator;
    }

    public int getNum() {
        return numerator;
    }

    public int getDen() {
        return denominator;
    }

    /**
     * return true if fraction f is equal to this fraction.
     * It does not take into account if two fractions are equal in value, just if the numerators and denominators are the same.
     * @param f - the fraction to compare with
     * @return - a boolean value that represents if f is equal to this fraction or not
     */
    public boolean equals(Fraction f)
    {
        if(numerator == f.numerator && denominator == f.denominator) return true;
        return false;
    }

    public double toDouble() {
        return (double) numerator / denominator;
    }

    /**
     * Method to set numerator to num
     *
     * @param num - value to update numerator
     */
    public void setNum(int num) {
        numerator = num;
    }

    /**
     * Method to set denominator to num
     *
     * @param den - value to update denominator
     */
    public void setDen(int den) {
        if (den != 0) denominator = den;
        else
            System.out.println("Error: Can not change denominator to 0");
    }

    /**
     * mutator method to reduce the fraction to the lowest terms
     *
     * checks so that there will be no negative value given to the gcf helper method
     */
    public void reduce() {
        boolean negative = false;
        if(numerator<0 && denominator<0)
        {
            numerator *= -1;
            denominator *= -1;
        }
        else if(numerator<0)
        {
            numerator*=-1;
            negative = true;
        }
        else if(denominator<0)
        {
            denominator*=-1;
            negative = true;
        }

        int factor = gcf(numerator, denominator);
        numerator /= factor;
        denominator /= factor;
        if(negative) numerator*= -1;
    }

    /**
     * Helper method for calculating the GCF between two values by using Euclid's Algorithm
     *
     * @param num1 - the first number
     * @param num2 - the second number
     * @return return the value of gcf between the two values
     */
    private int gcf(int num1, int num2) {
        if(num1 == 0)   return 1;
        if (num1 == num2) return num1;
        if (num1 > num2) return gcf(num1 - num2, num2);
        return gcf(num2 - num1, num1);
    }

    /**
     * multiply the current fraction with the given fraction
     * @param multiply - the Fraction to multiply by
     */
    public void multiply(Fraction multiply) {
        numerator *= multiply.numerator;
        denominator *= multiply.denominator;
        reduce();
    }

    /**
     * divide the current fraction with the given fraction
     * @param divisor - the Fraction to divide by
     */
    public void divide(Fraction divisor) {
        numerator *= divisor.denominator;
        denominator *= divisor.numerator;
        reduce();
    }

    /**
     * add the current fraction with the given fraction
     * @param a - Fraction to add by
     */
    public void add(Fraction a) {
        int temp = numerator * a.denominator + a.numerator * denominator;
        numerator = temp;
        denominator *= a.denominator;
        reduce();
    }

    /**
     * subtract the current fraction with the given fraction
     * @param s - Fraction to subtract by
     */
    public void subtract(Fraction s) {
        int temp = numerator * s.denominator - s.numerator * denominator;
        numerator = temp;
        denominator *= s.denominator;
        reduce();
    }



    /**
     * method to multiply two fractions together
     * @param a - the first fraction
     * @param b - the second fraction
     * @return return the new fraction that represents fraction a and fraction b multiplied together
     */

    /*
    public static Fraction multiply (Fraction a, Fraction b)
    {
        Fraction ans = new Fraction(a.numerator*b.numerator, a.denominator*b.denominator);
        ans.reduce();
        return ans;
    }

    public static Fraction divide (Fraction dividend, Fraction divisor)
    {
        Fraction ans = new Fraction(dividend.numerator * divisor.denominator, dividend.denominator * divisor.numerator);
        ans.reduce();
        return ans;
    }

     */


}

public class Main {
    public static void main(String[] args) {

        Fraction test0 = new Fraction(); //1/1
        Fraction test1 = new Fraction(99,11); //9/1
        Fraction test2 = new Fraction("53/13");
        Fraction test3 = new Fraction(1,12);

        test0.add(test1);
        System.out.println("added test0 and test1: " + test0);
        test2.subtract(test1); //-64/13
        System.out.println("subtracted test1 from test2: "+test2);
        test3.multiply(test2); //-16/39
        System.out.println("test3 multiplied new value of test 2: "+test3);
        test3.divide(test1); //-16/351
        System.out.println("new test3 divided by test1: "+test3);

//        Fraction f = new Fraction(252,105);
//        System.out.println(f);
//        f.reduce();
//        System.out.println(f);
//
//        Fraction f0 = new Fraction(3,4);
//        f.divide(f0);
//        //Fraction ans = new Fraction(Fraction.divide(f,f0));
//        System.out.println(f);

        /*
        Fraction f1 = new Fraction();
        Fraction f2 = new Fraction(1,2);
        Fraction f3 = new Fraction("2/1");
        Fraction f4 = new Fraction(f3);
        System.out.println("Num of f1 is "+f1.getNum());
        System.out.println("Den of f2 is "+f2.getDen());
        System.out.println("double of f3 is "+f3.toDouble());
        System.out.println("value of f4 is "+f4);
        f4.setNum(5);
        f4.setDen(1);
        System.out.println("New value of f4 is "+f4);

         */


    }

}

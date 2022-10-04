//Mickey Zhao
//Sept. 29th 2022
//Problem Set 2-1

//Tuple Class
public class Tuple {
    double A; //tuple value 1
    double B;//tuple value 2

    //constructor
    public Tuple()
    {
        A = 0;
        B = 0;
    }

    //constructor
    public Tuple(double a, double b)
    {
        A = a;
        B = b;
    }

    //overriding toString function
    public String toString()
    {
        return(A+","+B);
    }
}

public class Tuple {
    double A;
    double B;

    public Tuple()
    {
        A = 0;
        B = 0;
    }

    public Tuple(double a, double b)
    {
        A = a;
        B = b;
    }

    public String toString()
    {
        return(A+","+B);
    }
}

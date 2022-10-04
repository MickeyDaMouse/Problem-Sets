import java.util.*;
public class Formulas {

    //quadratic formula
    public static Tuple quadratic_formula (double a, double b, double c)
    {
        Tuple ans;
        double ans1;//stores one possible answer
        double ans2;//stores the other possible answer

        //[-b+sqrt(b^2-4ac)]/2a
        ans1 = (b*(-1) + Math.sqrt(b*b - 4*a*c))/(2*a);

        //[-b+sqrt(b^2-4ac)]/2a
        ans2 = (b*(-1) - Math.sqrt(b*b - 4*a*c))/(2*a);

        ans = new Tuple(ans1, ans2);

        return ans;
    }

    public static double slope (double x1, double y1, double x2, double y2)
    {
        return (y2-y1)/(x2-x1);
    }

    public static Tuple midpoint (double x1, double y1, double x2, double y2)
    {
        return new Tuple((x1+x2)/2, (y1+y2)/2);
    }

    public static double arithmetic_sum (double k, double a1, double an)
    {
        return( k/2.0*(a1+a1+an*(k-1)));
    }

    public static double geometric_sum (int k, double g1, double r)
    {
        return (g1*(1-Math.pow(r, k))/(1-r));
    }

    public static double inf_geometric_sum (double g1, double r)
    {
        return (g1/(1-r));
    }
}

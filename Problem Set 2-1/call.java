import java.text.Normalizer;

public class call {
    public static void main(String[] args) {

        //quadratic formula
        System.out.println(Formulas.quadratic_formula(1.0,5.0,6.0));

        //slope
        System.out.println(Formulas.slope(0,0,2,3));

        //midpoint
        System.out.println(Formulas.midpoint(0,0,2,3));

        //arithmetic sum
        System.out.println(Formulas.arithmetic_sum(5,1,1));

        //geometric sum
        System.out.println(Formulas.geometric_sum(3,3.0,2.0));

        //infinite geometric sum
        System.out.println(Formulas.inf_geometric_sum(8.0,0.5));
    }
}

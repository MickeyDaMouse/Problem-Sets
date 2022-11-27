public class EstimatePi {
    public static void main(String[] args) {
        Fraction Milu = new Fraction(355,113);
        final double EPSILON = Math.abs(Math.PI - Milu.toDouble());

        Fraction pi = new Fraction(Milu);

        while( ! (Math.abs(Math.PI - pi.toDouble()) < EPSILON))
        {
            if(pi.toDouble() < Math.PI)
                pi.setNum(pi.getNum()+1);

            else
                pi.setDen(pi.getDen()+1);
        }

        System.out.println(pi);
    }
}

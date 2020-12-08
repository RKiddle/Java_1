/******************************************************************************
 *Compilation:javac QuadraticABC.java
 *Execution:java Quadatic a b c
 *
 *Given a, b and c,solves for the roots of ax*x+b*x+c.
 *Assumes both roots are real valued.
 *
 *
 *%java Quadratic-1.0-1.0
 *1.618033988749895
 *-0.6180339887498949
 *
 *Remark:1.6180339...is the golden ratio.
 *
 *
 *
 *
 ******************************************************************************/

public class QuadraticABC {

    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);

        double discriminant = b * b - (4.0 * a * c);
        double sqroot = Math.sqrt(discriminant);

        double root1 = (-b + sqroot) / (2.0 * a);
        double root2 = (-b - sqroot) / (2.0 * a);

        System.out.println(root1);
        System.out.println(root2);
    }
}

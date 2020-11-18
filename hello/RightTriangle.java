/*
 * @author: Richard Kiddle 18/11/20
 * @desciption:
 * 3 Arguments from the command-line: a, b and c.
 * Compares a^2 + b^2 == c^2
 * Prints out true if it is a right angle triangle

 *  */

public class RightTriangle {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        boolean isRightTriangle;
        isRightTriangle = ((a > 0 && b > 0 && c > 0) &&
                (a * a == (b * b + c * c) || b * b == (a * a + c * c) ||
                        c * c == (a * a + b * b)));

        System.out.println(isRightTriangle);


    }
}


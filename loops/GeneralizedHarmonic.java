/*
@author: Richard Kiddle 25/11/20
@description:
Uses a for loop to compute the nth generalized harmonic number of order r.
two command-line arguments: n, r

 */

public class GeneralizedHarmonic {
    public static void main(String[] args) { // Compute the nth harmonic number.
        int n = Integer.parseInt(args[0]);
        int r = Integer.parseInt(args[1]);
        double sum = 0.0;
        for (int i = 1; i <= n; i++) { // Add the ith term to the sum.
            sum += 1.0 / Math.pow(i, r); // 1/i power r
        }
        System.out.println(sum);
    }
}

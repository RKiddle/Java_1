/*
@author: Richard Kiddle 8/12/20
@description: Takes a command-line integer m; reads a sequence of integers between 1 and m from standard input;
and prints the Shannon entropy to standard output, with 4 digits after the decimal point.


@compilation:   javac-introcs ShannonEntropy.java

@execution: java-introcs ShannonEntropy m < numbers.txt
 */


public class ShannonEntropy {

    public static void main(String[] args) {
        // Read in n integers between 1 and m.
        int m = Integer.parseInt(args[0]);
        // Number of integers
        int n = 0;
        //freq[i] = number of times x appears

        int[] freq = new int[m + 1];
        while (!StdIn.isEmpty()) {
            int x = StdIn.readInt();
            freq[x]++;
            n++;

        }
        //Compute Shannon Entropy
        double sEntropy = 0.0;
        for (int i = 1; i <= m; i++) {
            double prop = 1.0 * freq[i] / n;
            if (freq[i] > 0)
                sEntropy -= prop * Math.log(prop) / Math.log(2);
        }
        // print results
        StdOut.printf("%.4f\n", sEntropy);
    }

}

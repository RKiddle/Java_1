/*
@author: Richard Kiddle 01/12/20
@description:Takes an integer command-line argument n and prints an n-by-n pattern.
Includes two space characters between each + and - character.
 */

public class ThueMorse {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean[] tm = new boolean[n];

        tm[0] = true;
        int p = 1;

        // Generate a Thue Morse weave of size n
        while (p < n) {
            int pcopy = p;
            // Copy the previous weave but inverted
            for (int i = 0; i < p; i++) {
                tm[pcopy] = !tm[i];
                pcopy++;

                if (pcopy == n)
                    break;
            }

            p = pcopy;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (tm[i]) {
                    if (tm[j])
                        System.out.print("+  ");
                    else
                        System.out.print("-  ");
                } else {
                    if (tm[j])
                        System.out.print("-  ");
                    else
                        System.out.print("+  ");
                }
            }
            System.out.println();
        }
    }

}

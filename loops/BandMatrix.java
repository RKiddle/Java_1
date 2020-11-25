/*
@author: Richard Kiddle 25/11/20
@description:
prints an n-by-n pattern like the ones below, with a zero (0) for each element whose distance
from the main diagonal is strictly more than width,
and an asterisk (*) for each entry that is not, and two spaces between each 0 or *.

Two command-line arguments: n, width

 */

public class BandMatrix {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);      // defines nxn matrix
        int width = Integer.parseInt(args[1]);  // distance

        for (int row = 0; row < n; row++) {     //  loop for rows
            for (int column = 0; column < n; column++) {    //  loop for columns
                if (Math.abs(row - column) > width) {      // checks difference of row and column > width
                    System.out.print("0");                  // prints *
                } else {
                    System.out.print("*");                  // prints 0
                }

                // we adding twos whitespaces after each character,
                if (column < n - 1) {
                    System.out.print("  ");
                }
            }

            // prints a new line
            System.out.print("\n");
        }
    }
}

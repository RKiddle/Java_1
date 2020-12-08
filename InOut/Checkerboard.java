/*
@author: Richard Kiddle 8/12/20
@description: Takes command-line integer n and plots an n-by-n checkerboard pattern to standard drawing.
Color the squares blue and light gray, with the bottom-left square blue

@compilation:   javac-introcs Checkerboard.java

@execution: java-introcs Checkerboard
 */


public class Checkerboard {
    public static void main(String[] args) {
        // Read in n checkerboard size (n x n)
        int n = Integer.parseInt(args[0]);

        //Display Squares
        // Set the co-ordinates
        //double boardSize = n;
        double squareX = 0.0;
        double squareY = 0.0;
        double squareRadius = 0.5;

        StdDraw.setScale(0, n);
        StdDraw.clear();
        //Set position of squares
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                squareX = (i + 0.5);
                squareY = (j + 0.5);

                //set square colours
                if (n % 2 > 0) {
                    if ((i % 2 != 0) == (j % 2 != 0)) {

                        StdDraw.setPenColor(StdDraw.BLUE);

                    } else {

                        StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
                    }
                } else {


                    if ((i % 2 == 0) == (j % 2 == 0)) {

                        StdDraw.setPenColor(StdDraw.BLUE);

                    } else {

                        StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
                    }
                }
                StdDraw.filledSquare(squareX, squareY, squareRadius);


            }
            StdDraw.show();
        }

    }


}

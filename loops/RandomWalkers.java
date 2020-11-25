/*
@author: Richard Kiddle 25/11/20
@description:
Simulates the motion of a series of random walks
until the random walker is at Manhattan distance r from the starting point.
Prints the average of the total number of steps taken.

One command-line arguments: r (Manhattan distance from (0,0)) and trials (number of experiemnts).

 */


public class RandomWalkers {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);      // Maximum Manhattan distance from origin
        int trials = Integer.parseInt(args[1]);


        int steps = 0; // sets number of steps to 0.

        for (int i = 0; i < trials; i++) {
            int x = 0; // sets x and y coordinates to (0,0)
            int y = 0;

            while ((Math.abs(x) + Math.abs(y)) < r) {

                int randomDirection = (int) Math.round(3.0 * Math.random());

                switch (randomDirection) {
                    case 0: // East
                        x += 1;
                        break;
                    case 1: // North
                        y += 1;
                        break;
                    case 2: // South
                        y -= 1;
                        break;
                    case 3: // West
                        x -= 1;
                        break;
                }

                steps++;


            }


        }
        System.out.println("Average number of setps = " + ((double) steps / trials));
        // System.out.format("Average number of setps = %f%n", (float) steps / trials); // grader doesn't allow this
    }
}

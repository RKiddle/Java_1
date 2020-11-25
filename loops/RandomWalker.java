/*
@author: Richard Kiddle 25/11/20
@description:
Takes an integer command-line argument r and simulates the motion of a random walk until the random walker is at
Manhattan distance r from the starting point.
Prints the coordinates at each step of the walk and the total number of steps taken.

One command-line arguments: r (Manhattan distance from (0,0)).

 */


public class RandomWalker {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);      // Maximum Manhattan distance from origin

        int x = 0; // sets x and y coordinates to (0,0)
        int y = 0;
        System.out.println("(" + x + ", " + y + ")");
        int steps = 0; // sets number of steps to 0.
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

            System.out.println("(" + x + ", " + y + ")");

        }


        System.out.println("steps = " + steps);
    }
}

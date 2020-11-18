/*
@description:
converts from CMYK format to RGB format using these mathematical formulas:
white = 1 - black
red = 255 x white x (1-cyan)
green  = 255 x white x (1-magenta)
blue = 255 x white x (1-yellow)

four command-line arguments: cyan, magenta, yellow, black
converts to integers and prints red, green and blue
@author: Richard Kidde 18/11/20

 */

public class CMYKtoRGB {
    public static void main(String[] args) {
        double cyan = Double.parseDouble(args[0]);
        double magenta = Double.parseDouble(args[1]);
        double yellow = Double.parseDouble(args[2]);
        double black = Double.parseDouble(args[3]);

        double white = (1 - black);
        double red = 255 * white * (1 - cyan);
        double green = 255 * white * (1 - magenta);
        double blue = 255 * white * (1 - yellow);

        int intRed = (int) Math.round (red);
        int intGreen = (int) Math.round(green);
        int intBlue = (int) Math.round(blue);

        System.out.println("red   " + "= " + intRed);
        System.out.println("green " + "= " + intGreen);
        System.out.println("blue  " + "= " + intBlue);

    }

}

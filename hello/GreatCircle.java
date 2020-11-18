/*
@author: Richard Kiddle 18/11/20
@description:
Finds the distance between two points using the Haversine formula.
four command-line arguments: x1, y1, x2, y2

 */



public class GreatCircle {
    public static void main(String[] args) {
        double x1 = Double.parseDouble(args[0]);
        double y1 = Double.parseDouble(args[1]);
        double x2 = Double.parseDouble(args[2]);
        double y2 = Double.parseDouble(args[3]);

        double dLat = Math.toRadians(x2-x1);
        double dLong = Math.toRadians(y2-y1);

        // radius of the Earth in kilometers
        double radius = 6371.0;

        x1 = Math.toRadians(x1);
        x2 = Math.toRadians(x2);

        double a = Math.pow(Math.sin(dLat / 2), 2) + Math.pow(Math.sin(dLong / 2), 2) * Math.cos(x1) * Math.cos(x2);
        double c = 2 * Math.asin(Math.sqrt(a));
        double haversine = radius * c;

        System.out.println(haversine + " kilometers");





    }
}

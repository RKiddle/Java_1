/*
@author: Richard Kiddle 8/12/20
@description: Reads boundary information of a country (or other geographic entity) from standard input and
plots the results to standard drawing. A country consists of a set of regions
(e.g., states, provinces, or other administrative divisions), each of which is described by a polygon

javac-introcs WorldMap.java

java-introcs WorldMap < usa.txt
 */


public class WorldMap {

    public static void main(String[] args) {
        // Scale as per first four values.
        StdDraw.enableDoubleBuffering();
        double x0 = 0;
        double y0 = 0;
        int x1 = StdIn.readInt();
        int y1 = StdIn.readInt();
        StdDraw.setCanvasSize(x1, y1);
        StdDraw.setXscale(x0, x1);
        StdDraw.setYscale(y0, y1);
        // Read the points and plot to standard drawing.
        while (!StdIn.isEmpty()) {
            String location = StdIn.readString();
            int n = StdIn.readInt();
            double[] xCor = new double[n];
            double[] yCor = new double[n];
            for (int i = 0; i < n; i++) {
                xCor[i] = StdIn.readDouble();
                yCor[i] = StdIn.readDouble();
            }
            StdDraw.polygon(xCor, yCor);
        }
        StdDraw.show();
    }
}

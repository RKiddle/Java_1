/*
Reads boundary information of a country (or other geographic entity) from standard input and
plots the results to standard drawing. A country consists of a set of regions
(e.g., states, provinces, or other administrative divisions), each of which is described by a polygon

 */


public class WorldMap {

    public static void main(String[] args) {
        // Scale as per first four values.
        double x0 = 0;
        double y0 = 0;
        double x1 = StdIn.readDouble();
        double y1 = StdIn.readDouble();
        StdDraw.setXscale(x0, x1);
        StdDraw.setYscale(y0, y1);
        // Read the points and plot to standard drawing.
        while (!StdIn.isEmpty()) {
            String location = StdIn.readString();
            int n = StdIn.readInt();
            double[] x_cor = new double[n];
            double[] y_cor = new double[n];
            for (int i = 0; i < n; i++) {
                x_cor[i] = StdIn.readDouble();
                y_cor[i] = StdIn.readDouble();
            }
            StdDraw.polygon(x_cor, y_cor);
        }
    }
}

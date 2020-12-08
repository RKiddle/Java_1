/*
@author: Richard Kiddle 01/12/20
@description: Takes two integer command-line arguments n and trials and performs the following experiment, trials times:
takes three integer command-line arguments m, n, and k and prints an m-by-n grid of cells with k mines,
using asterisks for mines and integers for the neighboring mine counts (with two space characters between each cell)
 */
public class Minesweeper {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);
        boolean[][] hasMine = new boolean[m][n];
        boolean[][] hasMine_extended = new boolean[m + 2][n + 2];
        int[][] numberOfNeighboringMines = new int[m][n];
        int a = 1;
        while (a <= k) {
            int i = (int) (Math.random() * m);
            int j = (int) (Math.random() * n);
            if (!hasMine[i][j]) {
                hasMine[i][j] = true;
                a++;
            }
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                // copying to extended grid
                hasMine_extended[i][j] = hasMine[i - 1][j - 1];
            }
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (hasMine_extended[i][j] == false) {
                    for (int s = -1; s <= 1; s++) {
                        for (int t = -1; t <= 1; t++)
                            if (hasMine_extended[i + s][j + t] == true)
                                numberOfNeighboringMines[i - 1][j - 1] += 1;
                    }
                }
            }
        }

        for (int i = 0; i < numberOfNeighboringMines.length; i++) {
            for (int j = 0; j < numberOfNeighboringMines[i].length; j++) {
                if (hasMine[i][j] == true)
                    System.out.print("*" + "  ");
                else
                    System.out.print(numberOfNeighboringMines[i][j] + "  ");
            }
            System.out.println();
        }


    }
}

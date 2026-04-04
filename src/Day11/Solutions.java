package Day11;

import java.util.Arrays;

public class Solutions {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean[][] aux = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    aux[i][j] = true;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (aux[i][j]) {
                   updateMatrix(matrix, i, j);
                }
            }
        }

    }

    public void updateMatrix(int[][] matrix, int row, int col) {
        // bottom   col
        int bt = row;
        while (bt < matrix.length) {
            matrix[bt++][col] = 0;
        }
        // up row
        int up = 0;
        while (up < row) {
            matrix[up++][col] = 0;
        }
        // left col
        int lf = 0;
        while (lf < col) {
            matrix[row][lf++] = 0;
        }
        // right col
        int rt = col;
        while (rt < matrix[0].length) {
            matrix[row][rt++] = 0;
        }
    }

    void print2D(boolean[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    void print2D(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {0,1,2,0},
                {3,4,5,2},
                {1,3,1,5}
        };
        Solutions sb = new Solutions();
        sb.setZeroes(matrix);
        sb.print2D(matrix);
    }
}

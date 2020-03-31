package com.algorithms;

public class MatrixTraversalByDiagonals {

    public String traverse(final int R, int C, int[][] matrix) {
        String results = "";
        for (int i = 0; i < R; i++) {
            results += extractDiagonal(i, 0, C, matrix);
        }

        for (int j = 1; j < C; j++) {
            results += extractDiagonal(R - 1, j, C, matrix);
        }

        return results.trim();
    }

    private String extractDiagonal(final int i, final int j, final int C, final int[][] matrix) {
        int x = i;
        int y = j;
        String result = "";
        while (x >= 0 && y < C ) {
            if((i + j) % 2 == 0){
                result = matrix[x][y] + " " + result;
            } else {
                result += matrix[x][y] + " ";
            }
            x--;
            y++;
        }
        return result;
    }
}

package com.algorithms;

public class MatrixTraversalByDiagonals {

    public String traverse(final int R, int C, int[][] matrix) {
        StringBuilder results = new StringBuilder();
        for (int i = 0; i < R; i++) {
            results.append(extractDiagonal(i, 0, C, matrix));
        }

        for (int j = 1; j < C; j++) {
            results.append(extractDiagonal(R - 1, j, C, matrix));
        }

        return results.toString().trim();
    }

    private StringBuilder extractDiagonal(final int i, final int j, final int C, final int[][] matrix) {
        int x = i;
        int y = j;
        StringBuilder result = new StringBuilder();
        while (x >= 0 && y < C ) {
            if((i + j) % 2 == 0){
                result.insert(0, matrix[x][y] + " ");
            } else {
                result.append(matrix[x][y]);
                result.append(" ");
            }
            x--;
            y++;
        }
        return result;
    }
}

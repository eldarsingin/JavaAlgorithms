package com.algorithms;

public class MatrixTraversalByDiagonals {

    public String traverse(final int R, int C, int[][] matrix) {
        StringBuilder results = new StringBuilder();
        for (int i = 0; i < C; i++) {
            results.append(extractDiagonal(i, 0, R, matrix));
        }

        for (int j = 1; j < R; j++) {
            results.append(extractDiagonal(C - 1, j, R, matrix));
        }

        return results.toString().trim();
    }

    private StringBuilder extractDiagonal(final int i, final int j, final int R, final int[][] matrix) {
        int x = i;
        int y = j;
        final StringBuilder result = new StringBuilder();
        while (x >= 0 && y < R ) {
            if((i + j) % 2 == 0){
                result.insert(0, matrix[y][x] + " ");
            } else {
                result.append(matrix[y][x]);
                result.append(" ");
            }
            x--;
            y++;
        }
        return result;
    }
}

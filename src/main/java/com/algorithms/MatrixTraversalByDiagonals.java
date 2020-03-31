package com.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MatrixTraversalByDiagonals {

    public String traverse(final int R, int C, int[][] matrix) {

        List<Integer> results = new ArrayList<>();
        boolean reverse = true;
        for (int i = 0; i < R; i++) {
            results.addAll(extractDiagonal(reverse, i, 0, C, matrix));
            reverse = !reverse;
        }

        for (int j = 1; j < C; j++) {
            results.addAll(extractDiagonal(reverse, R - 1, j, C, matrix));
            reverse = !reverse;
        }

        return results.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(" "));
    }

    private List<Integer> extractDiagonal(boolean reverse, int x, int y, int C, int[][] matrix) {
        List<Integer> diagonal = new ArrayList<>();
        while (x >= 0 && y < C ) {
            if(!reverse){
                diagonal.add(matrix[x][y]);
            } else {
                diagonal.add(0, matrix[x][y]);
            }
            x--;
            y++;
        }
        return diagonal;
    }
}

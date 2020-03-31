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
            int x = i;
            int y = 0;

            List<Integer> diagonal = new ArrayList<>();
            while (y < C && x >= 0) {
                diagonal.add(matrix[x][y]);
                x--;
                y++;
            }
            if (reverse) {
                Collections.reverse(diagonal);
            }
            results.addAll(diagonal);
            reverse = !reverse;
        }

        for (int j = 1; j < C; j++) {
            int x = R - 1;
            int y = j;

            List<Integer> diagonal = new ArrayList<>();
            while (y < C && x >= 0) {
                diagonal.add(matrix[x][y]);
                x--;
                y++;
            }

            if (reverse) {
                Collections.reverse(diagonal);
            }
            results.addAll(diagonal);
            reverse = !reverse;
        }

        return results.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(" "));
    }
}

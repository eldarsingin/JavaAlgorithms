package com.algorithms;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MatrixTraversalByDiagonalsTest {
    private MatrixTraversalByDiagonals testedInstance = new MatrixTraversalByDiagonals();

    @Test
    public void shouldTraverseSingleElementMatrix() {
        //given
        int[][] matrix = new int[][]{{333}};
        //when
        String result = testedInstance.traverse(1, 1, matrix);
        //then
        assertEquals("333", result);
    }

    @Test
    public void shouldTraverseHighSingleColumnMatrix() {
        //given
        int[][] matrix = new int[][]{
                {101},
                {102},
                {103},
                {104}
        };
        //when
        String result = testedInstance.traverse(4, 1, matrix);
        //then
        assertEquals("101 102 103 104", result);
    }

    @Test
    public void shouldTraverseHighMatrix() {
        //given
        int[][] matrix = new int[][]{
                {21, 22, 29},
                {31, 33, 39},
                {41, 44, 49},
                {51, 55, 59}
        };

        //when
        String result = testedInstance.traverse(4, 3, matrix);

        //then
        assertEquals("21 22 31 41 33 29 39 44 51 55 49 59", result);
    }

    @Test
    public void shouldTraverseSquareMatrix() {
        //given
        int[][] matrix = new int[][]{
                {10, 11, 12, 13},
                {14, 15, 16, 17},
                {18, 19, 20, 21},
                {22, 23, 24, 25}
        };
        //when
        String result = testedInstance.traverse(4, 4, matrix);

        //then
        assertEquals("10 11 14 18 15 12 13 16 19 22 23 20 17 21 24 25", result);
    }

    @Test
    public void shouldTraverseWideSingleRowMatrix() {
        //given
        int[][] matrix = new int[][]{
                {505, 506, 507, 508}
        };
        //when
        String result = testedInstance.traverse(1, 4, matrix);

        //then
        assertEquals("505 506 507 508", result);
    }

    @Test
    public void shouldTraverseHighDoubleColumnMatrix() {
        //given
        int[][] matrix = new int[][]{
                {1, 2},
                {3, 4},
                {5, 6},
                {7, 8}
        };
        //when
        String result = testedInstance.traverse(4, 2, matrix);

        //then
        assertEquals("1 2 3 5 4 6 7 8", result);
    }

    @Test
    public void shouldTraverseEmptyMatrix() {
        //given
        int[][] matrix = new int[][]{};
        //when
        String result = testedInstance.traverse(0, 0, matrix);

        //then
        assertTrue(result.isEmpty());
    }

    @Test
    public void shouldReturnEmptyStringWhenMatrixIsNull() {
        //given
        int[][] matrix = new int[][]{};
        //when
        String result = testedInstance.traverse(0, 0, null);

        //then
        assertTrue(result.isEmpty());
    }
}

package com.algorithms;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MatrixTraversalByChangingDirectionTest {

    private MatrixTraversalByChangingDirection testedInstance = new MatrixTraversalByChangingDirection();

    @Test
    public void shouldTraverseSingleElementMatrix() {
        //given
        int[][] matrix = new int[1][1];
        matrix[0][0] = 333;
        //when
        String result = testedInstance.traverse(1, 1, matrix);
        //then
        assertEquals("333", result);
    }

    @Test
    public void shouldTraverseWideMatrix() {
        //given
        int[][] matrix = new int[4][1];
        matrix[0][0] = 101;
        matrix[1][0] = 102;
        matrix[2][0] = 103;
        matrix[3][0] = 104;
        //when
        String result = testedInstance.traverse(4, 1, matrix);
        //then
        assertEquals("101 102 103 104", result);
    }

    @Test
    public void shouldTraverseHighMatrix() {
        //given
        int[][] matrix = new int[3][4];
        matrix[0][0] = 21;
        matrix[1][0] = 22;
        matrix[2][0] = 29;

        matrix[0][1] = 31;
        matrix[1][1] = 33;
        matrix[2][1] = 39;

        matrix[0][2] = 41;
        matrix[1][2] = 44;
        matrix[2][2] = 49;

        matrix[0][3] = 51;
        matrix[1][3] = 55;
        matrix[2][3] = 59;

        //when
        String result = testedInstance.traverse(3, 4, matrix);

        //then
        assertEquals("21 22 31 41 33 29 39 44 51 55 49 59", result);
    }

    @Test
    public void shouldTraverseSquareMatrix() {
        //given
        int[][] matrix = new int[4][4];
        matrix[0][0] = 10;
        matrix[1][0] = 11;
        matrix[2][0] = 12;
        matrix[3][0] = 13;

        matrix[0][1] = 14;
        matrix[1][1] = 15;
        matrix[2][1] = 16;
        matrix[3][1] = 17;

        matrix[0][2] = 18;
        matrix[1][2] = 19;
        matrix[2][2] = 20;
        matrix[3][2] = 21;

        matrix[0][3] = 22;
        matrix[1][3] = 23;
        matrix[2][3] = 24;
        matrix[3][3] = 25;

        //when
        String result = testedInstance.traverse(4, 4, matrix);

        //then
        assertEquals("10 11 14 18 15 12 13 16 19 22 23 20 17 21 24 25", result);
    }
}

package com.algorithms.arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class RotateArrayTest {

    private RotateArray testedInstance = new RotateArray();

    @Test
    public void shouldRotateArray() {
        //given
        final int[] array = new int[]{1, 2, 3, 4, 5, 6, 7};
        //when
        final int[] result = testedInstance.rotateArray(array, 3);
        //then
        assertArrayEquals(new int[]{5, 6, 7, 1, 2, 3, 4}, result);
    }

    @Test
    public void shouldRotateArrayCyclically() {
        //given
        final int[] array = new int[]{1, 2, 3, 4, 5};
        //when
        final int[] result = testedInstance.rotateArray(array, 7);
        //then
        assertArrayEquals(new int[]{4, 5, 1, 2, 3}, result);
    }

    @Test
    public void shouldRotateAllElements() {
        //given
        final int[] array = new int[]{1, 2, 3, 4, 5};
        //when
        final int[] result = testedInstance.rotateArray(array, 5);
        //then
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, result);
    }

    @Test
    public void shouldReturnNullIfInputIsNull() {
        //when
        final int[] result = testedInstance.rotateArray(null, 3);
        //then
        assertNull(result);
    }

    @Test
    public void shouldReturnEmptyIfInputIsEmpty() {
        //when
        final int[] result = testedInstance.rotateArray(new int[]{}, 3);
        //then
        assertEquals(0, result.length);
    }
}

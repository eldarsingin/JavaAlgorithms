package com.algorithms.arrays;

import java.util.Arrays;

public class RotateArray {

    public int[] rotateArray(int[] array, int steps) {
        if (array == null || array.length <= 1) {
            return array;
        }
        if (steps > array.length) {
            steps = steps % array.length;
        }
//        return withIntermediateArray(array, steps);
//        return withArrayCopy(array, steps);
        return bubbleRotate(array, steps);
    }

    private int[] bubbleRotate(int[] array, int steps) {
        return new int[0];
    }

    private int[] withIntermediateArray(int[] array, int steps) {
        int[] result = new int[array.length];
        for(int i = 0; i < steps ; i++){
            result[i] = array[array.length - steps + i];
        }

        for(int i = steps; i < array.length ; i++){
            result[i] = array[i - steps];
        }
        return result;
    }

    private int[] withArrayCopy(int[] array, int steps) {
        int[] tailArray = Arrays.copyOfRange(array, array.length - steps, array.length);
        int[] headArray = Arrays.copyOfRange(array, 0, array.length - steps);

        int[] result = new int[array.length];
        System.arraycopy(tailArray, 0, result, 0, tailArray.length);
        System.arraycopy(headArray, 0, result, tailArray.length, headArray.length);
        return result;
    }

//    private int[] merge(int[] headArray, int[] tailArray) {
//        int[] result = new int[headArray.length + tailArray.length];
//        for (int i = 0; i < headArray.length; i++) {
//            result[i] = headArray[i];
//        }
//        for (int i = 0; i < tailArray.length; i++) {
//            result[headArray.length + i] = tailArray[i];
//        }
//        return result;
//    }
}

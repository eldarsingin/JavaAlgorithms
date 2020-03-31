package com.algorithms;

import java.math.BigInteger;

public class CompetitionTest {

    public static void main(String args[]) throws Exception {

        BigInteger bi = BigInteger.valueOf(1000000000*1000);
//        System.out.println(isPrime(5));
        solution(7, new int[]{2, 4, 6, 8, 10, 12, 14});
    }


    public static void solution(int N, int[] A) {

        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {

                if (isPrime(j - i)) {
//                    System.out.println(i + " " + j);
                    A[i] = A[j] - A[i];
                }
            }
        }

        BigInteger result = BigInteger.valueOf(0);
        for (int i = 0; i < A.length; i++) {
            result = result.add(BigInteger.valueOf(A[i]));
        }
        System.out.println(result);
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

}

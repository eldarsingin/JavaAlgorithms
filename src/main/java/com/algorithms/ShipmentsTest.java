package com.algorithms;

public class ShipmentsTest {

    public static void main(String args[]) throws Exception {
        solution(5, new int[]{1, 1, 1, 1, 6});
    }

    public static void solution(int N, int[] W) {
        int totalWeight = 0;
        for(int i = 0; i < W.length; i++ ){
            totalWeight += W[i];
        }

        if(totalWeight % W.length > 0){
            System.out.println(-1);
            return;
        }

        int averageWeight = totalWeight /    W.length;
        int numberOfMoves = 0;
        for(int i = 0; i < W.length; i++ ){
            if(W[i] < averageWeight){
                numberOfMoves += averageWeight - W[i];
            }
        }
        System.out.println(numberOfMoves);
    }

}

package com.algorithms;

import java.util.Scanner;

public class TestTest {

    public static void main(String args[]) throws Exception {
        solution(8);
    }

    public static void solution(int N) {
        boolean alternate = false;
        int half = N / 2 + N % 2;

        for(int i = 1; i <= half ; i++ ){
            String line = "";
            for (int j = 1; j <= N; j++){
                if(alternate){
                    if(j > N - i){
                        line += "*";
                    } else {
                        line += "#";
                    }
                } else {
                    if(j <= i){
                        line += "*";
                    } else {
                        line += "#";
                    }
                }
            }

            System.out.println(line);
            alternate = !alternate;
        }

        for(int i = half; i < N ; i++ ) {
            String line = "";
            for (int j = 1; j <= N; j++) {
                if (alternate) {
                    if (j > i) {
                        line += "*";
                    } else {
                        line += "#";
                    }
                } else {
                    if (j <= N - i) {
                        line += "*";
                    } else {
                        line += "#";
                    }
                }
            }
            System.out.println(line);
            alternate = !alternate;
        }
    }
}

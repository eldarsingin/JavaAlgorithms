package com.algorithms;

import java.util.function.BiPredicate;

public class IntegerPrinter {

    public void printAsHashesAndAsterixes(final int number) {
        boolean alternate = false;
        int half = number / 2 + number % 2;

        for (int i = 1; i <= half; i++) {
            printLine(getLine(alternate, number, i, (j, lineNumber) -> j.intValue() <= lineNumber));
            alternate = !alternate;
        }

        for (int i = half; i < number; i++) {
            printLine(getLine(alternate, number, i, (j, lineNumber) -> (j > lineNumber)));
            alternate = !alternate;
        }
    }

    private String getLine(boolean alternate, int number, int lineNumber, BiPredicate<Integer, Integer> predicate) {
        String line = "";

        for (int j = 1; j <= number; j++) {
            if (predicate.test(j, lineNumber)) {
                if (alternate) {
                    line += "*";
                } else {
                    line = "*" + line;
                }

            } else {
                if (alternate) {
                    line = "#" + line;
                } else {
                    line += "#";
                }
            }
        }
        return line;
    }

    protected void printLine(final String line) {
        System.out.println(line);
    }
}

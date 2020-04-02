package com.algorithms;

public class IntegerPrinter {

    public void printAsHashesAndAsterixes(final int number) {
        int half = number / 2 + number % 2;

        for (int i = 1; i <= number; i++) {
            int starsToPrint = i;
            if(i > half){
                starsToPrint = number - i + 1;
            }
            printLine(getLine(number, i, starsToPrint));
        }
    }

    private String getLine(final int number, final int lineNumber, final int starsToPrint) {
        StringBuilder line = printSymbolTimes('*', starsToPrint);
        StringBuilder hashes = printSymbolTimes('#', number - starsToPrint);

        if (lineNumber % 2 == 0) {
            line.insert(0, hashes);
        } else {
            line.append(hashes);
        }
        return line.toString();
    }

    private StringBuilder printSymbolTimes(char symbol, int starsToPrint) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < starsToPrint; i++) {
            result.append(symbol);
        }
        return result;
    }

    protected void printLine(final String line) {
        System.out.println(line);
    }
}

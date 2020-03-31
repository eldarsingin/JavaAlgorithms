package com.algorithms.strings;

public class StringAlgorithms {

    public String reverseWords(final String text) {
        if (text == null || "".equals(text)) {
            return text;
        }
        return inPlace(text.toCharArray());
    }

    private String inPlace(char[] chars) {
        int i = 0;
        for (int j = 0; j < chars.length; j++) {
            if (chars[j] == ' ') {
                reverse(chars, i, j - 1);
                i = j + 1;
            }
        }
        reverse(chars, i, chars.length - 1);
        reverse(chars, 0, chars.length - 1);

        return new String(chars);
    }

    private void reverse(char[] chars, int i, int j) {
        while (i < j) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }
    }


    private String byChar(final String text) {
        String reverseWords = "";
        String currentWord = "";
        for (final char c : text.toCharArray()) {
            if (c == ' ') {
                reverseWords = currentWord + " " + reverseWords;
                currentWord = "";
            } else {
                currentWord += c;
            }
        }
        reverseWords = currentWord + " " + reverseWords;
        return reverseWords.trim();
    }

    private String forEachReverseWithBuilder(final String text) {
        final String[] words = text.split(" ");
        final StringBuilder reverseWords = new StringBuilder();
        for (final String word : words) {
            if (word.equals(words[0])) {
                reverseWords.append(word);
            } else {
                reverseWords.insert(0, word + " ");
            }
        }
        return reverseWords.toString();
    }

    private String forEachReverse(final String phrase) {
        final String[] words = phrase.split(" ");
        String reverseWords = "";
        for (final String word : words) {
            reverseWords = word + " " + reverseWords;
        }
        return reverseWords.trim();
    }
}

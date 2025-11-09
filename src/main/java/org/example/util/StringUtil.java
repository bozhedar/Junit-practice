package org.example.util;

public class StringUtil {

    public static String reverseLetters(String str) {

        int start = 0;
        int end = str.length() - 1;
        char[] output = str.toCharArray();

        while (start <= end) {
            if (!Character.isLetter(str.charAt(start))) {
                start++;
            } else if (!Character.isLetter(str.charAt(end))) {
                end--;
            } else {
                char temp = output[start];
                output[start] = output[end];
                output[end] = temp;
                end--;
                start++;
            }
        }
        return new String(output);
    }
}



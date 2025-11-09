package org.example;


import org.example.util.StringUtil;

public class Main {
    public static void main(String[] args) {

        String string = "J@va the be$t!123";

        String result = StringUtil.reverseLetters(string);

        System.out.println("String: " + string);
        System.out.println("Result: " + result);
        System.out.println("Right: t@eb eht av$J!123");
    }
}
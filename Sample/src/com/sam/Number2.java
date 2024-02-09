package com.sam;

import java.util.Scanner;

public class Number2 {
    private static final String[] ones = {
            "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
            "eighteen", "nineteen"
    };
    private static final String[] tens = {
            "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
    };
    private static final String[] thousands = {"", "thousand", "million", "billion"};

    private static String convert(int n) {
        if (n < 20) {
            return ones[n];
        }
        if (n < 100) {
            return tens[n / 10] + (n % 10 != 0 ? " " + ones[n % 10] : "");
        }
        if (n < 1000) {
            return ones[n / 100] + " hundred" + (n % 100 != 0 ? " " + convert(n % 100) : "");
        }
        for (int i = 3; i >= 0; i--) {
            if (n >= Math.pow(1000, i)) {
                return convert(n / (int) Math.pow(1000, i)) + " " + thousands[i] + (n % Math.pow(1000, i) != 0 ? " " + convert(n % (int) Math.pow(1000, i)) : "");
            }
        }
        return "";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        System.out.println(convert(n));
    }
}
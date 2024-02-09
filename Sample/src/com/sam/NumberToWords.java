package com.sam;


public class NumberToWords {

	private static final String[] ones = {
            "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
           
    };

    private static final String[] tens = {
        "","Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };

    public static String convertToWords(int number) {
     
        if (number < 9) {
            return ones[number];
        } else {
            return tens[number / 10] +  ones[number % 10] ;
        }
    }

    public static void main(String[] args) {
        int i=99;
        String words = convertToWords(i);
            System.out.println(i + ": " + words);
        }
    
}
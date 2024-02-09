package com.sam;

import java.util.Scanner;

public class Operator1 {
	 public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
	 char choice;
	        do {
	            System.out.println("Enter 2 numbers:");
	            int num1 = sc.nextInt();
	            int num2 = sc.nextInt();

	            System.out.println("Choose an operation:");
	            System.out.println("1. Addition");
	            System.out.println("2. Subtraction");
	            System.out.println("3. Multiplication");
	            System.out.println("4. Divide");
	            System.out.println("5. Exit");

	            int operator = sc.nextInt();

	            switch (operator) {
	                case 1:
	                    System.out.println(num1 + num2);
	                    break;

	                case 2:
	                    System.out.println(num1 - num2);
	                    break;

	                case 3:
	                    System.out.println(num1 * num2);
	                    break;

	                case 4:
	                    if (num2 != 0) {
	                        System.out.println(num1 / num2);
	                    } else {
	                        System.out.println("Cannot divide by zero.");
	                    }
	                    break;

	                case 5:
	                    System.out.println("Exit");
	                    return;

	                default:
	                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
	            }
	           
	            System.out.println("next");
	            choice = sc.next().charAt(0);
	            

	        } while (choice == 'y' || choice == 'Y');

	        System.out.println("Exiting calculator.");
	        sc.close();
	    }
	}


package com.sam;

import java.util.Scanner;

public class Calculator {
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);

		 
		System.out.println("enter 2 numbers");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
     System.out.println("choose any one num (1.addition,2.subtraction,3.multiplication,4.divide,5.exit)");
		
		char choose =sc.next().charAt(0);
			
		//System.out.println("1.addition");
		 //System.out.println("2.subtraction");
		// System.out.println("3.multiplication");
		 //System.out.println("4.divide");
		 //System.out.println("5.exit");


			int operator=sc.nextInt();

			 
		 switch(operator)
	
	{
	case 1:
		//System.out.println("addition");
		int result=num1+num2;
		break;
		
	
	case 2:
		System.out.println(num1-num2);
		
		break;
	        
	case 3:
		System.out.println(num1*num2);
		
		break;
		
	case 4:
		System.out.println(num1/num2);
		
		break;
	case 5:
		System.out.println("exit");
     
		break;
		
		
	default:
		
		System.out.println("Error:invalid operator.");
		
            	        
			}
		 
}
}

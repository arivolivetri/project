package com.sam;

import java.util.Scanner;

public class Maxium {
	public static void main(String[] args) {
		
	Scanner scan=new Scanner(System.in);
	
	        int num = 0;
	        int firstmax=0;
	        int secondMax=0;
	        
	        System.out.println(" Enter 5 numbers ");
	        for (int i=0 ; i<5 ; i++) 
	        num = scan.nextInt();
	        
	        if(num>secondMax&&num<firstmax)   // case 2
	        {
	            secondMax = num;
	        } 
	        else if(num>firstmax)   // case 1
	        {
	            secondMax = firstmax;
	           firstmax = num;
	        }
	}
}
	      /*  for (int i=0 ; i<5 ; i++) 
	        {
	            num = scan.nextInt();
              
	           
	            if(num>firstmax )
	                firstmax = num;

	            else if(firstmax>secondMax && secondMax<num)
	            
	            {
	            	secondMax = num;
	            }
	        }
	        System.out.println("The  first  largest value is " + firstmax); 
	        System.out.println("The second largest value is " + secondMax );
	    }*/

	





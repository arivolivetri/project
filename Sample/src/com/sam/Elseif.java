package com.sam;

import java.util.Scanner;

public class Elseif {
      public static void main(String[] args) {
		//int a=6;
		//int b=6;
    	  
    	  Scanner obj=new Scanner(System.in);
    	  System.out.println("enter 2 numbers");
    	  int a=obj.nextInt();
           int b=obj.nextInt();
      
		if(a>b)
		{
			System.out.println("greater");
			
		}
		else if(a<b)
		{
			System.out.println("lesser");
		}
		
		else
		{
			System.out.println("equal");
		}
	}
}

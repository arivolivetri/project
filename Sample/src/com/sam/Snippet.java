package com.sam;

import java.util.Scanner;

public class Snippet {
	public static void main(String[] args) {
		
	
	   Scanner obj=new Scanner(System.in);  
			System.out.print("Enter the number of elements ");  
			 
			 int arr=obj.nextInt();  
			int[] array = new int[10];  
		     for(int i=0; i<arr; i++)  
			{  
			  
			array[i]=obj.nextInt();  
			}  
			System.out.println("Array elements are: ");  
		  
			for (int i=0; i<arr; i++)   
			{  
			System.out.println(array[i]);  
			}  
			System.out.println("single dimensional " +array[0]);	
			
			}  
}


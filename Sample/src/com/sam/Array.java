package com.sam;

public class Array {
public static void main(String[] args) {
	int mark[]=new int[5];
//	int i;
	mark[0]=88;
	mark[1]=99;
	mark[2]=55;
	mark[3]=77;
	mark[4]=43;
	System.out.println("marks: " + mark[0]   +   mark[4]);
	System.out.println("before mark:" + mark[3]);
	
	mark[3]=44;
	
		System.out.println("after mark: "+ mark[3]);
		
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		cars[3]="sheep";
		System.out.println(cars[3]);
		System.out.println(cars.length);
		//String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		for (int i = 0; i < cars.length; i++) 
		{
		  System.out.println(cars[i]);
		  
		  //for (String i : cars) {
			  System.out.println(i);
			 
			  
			  int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
			  System.out.println(myNumbers[1][2]);
			  myNumbers[1][2] = 9;
			  System.out.println(myNumbers[1][2]);
			}
		}
}


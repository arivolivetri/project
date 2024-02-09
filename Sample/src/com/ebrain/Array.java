package com.ebrain;


import java.util.Arrays;

public class Array{
public static void main(String[] args) {
  String [] obj={"orange","union","ant","ice","eagle"};
    System.out.println("before sorting" + Arrays.toString(obj));
	Arrays.sort(obj);
	System.out.println(" sorted in ascending order");
	
	for(int i=0;i<obj.length;i++)
	{
		System.out.println(obj[i]);
	}
}
}

package com.sam;

import java.util.ArrayList;
import java.util.List;

public class arraylist {
	 
	public static void main(String args[])   
	{   
	//creating an instance of ArrayList  
	List<Integer> list = new ArrayList<Integer>();   
	//adding element to arraylist  
	list.add(12);   
	list.add(34);   
	list.add(56);   
	list.add(78);   
	//iteration over ArrayList using for-each loop  
	for(int f:list)  
	{  
	System.out.println(f);   
	}  
	}   
	}  


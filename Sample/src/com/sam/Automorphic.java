package com.sam;

public class Automorphic {
	static boolean booleannumber (int num) {
	 
	 int square=num*num;
	
	while(num>0)
	{
		if(num%10 != square%10 )
		{
			
	
	return false;
		
		}	
		
	  int num1=num/10;
	  square=square/10;
	  
	  return true;
		}
	return false;
	
		}
	

	public static void main(String[] args) {
		System.out.println(booleannumber(99)? "automorphic": "not automorphic");
	}
}

	

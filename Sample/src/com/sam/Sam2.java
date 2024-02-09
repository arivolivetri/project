package com.sam;

public class Sam2 {
public static void main(String[] args)
{
	
	int x=4;
	int y=6;
	int z=x+y;
	
	String X="22";
	String Y="44";
	String Z=X+Y;
	
	
	String a="5";
	int b=4;
	String c=a+b;

	String txt="john";
	String txt2="peter";
	//int s=txt.length();
	System.out.println("the length is" + txt.length());
//	System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
	//System.out.println(txt.toLowerCase()); 
	System.out.println(txt.indexOf("john"));
	System.out.println(txt+ " " +txt2);
	System.out.println(txt.concat(txt2));
	System.out.println(z);
	System.out.println(Z);
	System.out.println(c);
}
}
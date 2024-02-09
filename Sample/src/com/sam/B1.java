package com.sam;

public class B1 extends A1{
	B1()
{
		A1 obj=new A1();
	obj.displayA1();
	 
	System.out.println("constructor");
}
     static  void display()
{
	System.out.println("inheritance");
	}
}

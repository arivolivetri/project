package com.sam;

public class Sam1 extends Sam{
	
	int a;
	void display()
	
	{
		System.out.println("display b");
		super.display();
		 a=34;
		 super.a=33;
		int  c=a+super.a;
		System.out.println(c);
		 
	}
	Sam obj1=new Sam();

	
	{
		System.out.println("print");
	}
public static void main(String[] args) {
	Sam1 obj=new Sam1();
	obj.display();
	System.out.println("hate the fake");
}
}

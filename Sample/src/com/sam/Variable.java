package com.sam;

public class Variable {
	int   a=100;
public static void main(String[] args) {
	//int a$, myvariable1=20;//declaration
//	a$=10;//initialization
	//System.out.println(a$+" "+myvariable1);//printing statement

	Variable v=new Variable();
	Variable v1=new Variable();
	v1.a=300;
       System.out.println(v1.a);
       v.display();
}

	public void display()
	{
		System.out.println(a);
		}
	



}


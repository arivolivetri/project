package com.sam;

public class Sample1 {
	int a = 5;
	static int b = 23;

	public static void main(String arg[]) {

		int b = 20;

		Sample1 obj = new Sample1();
		int c = obj.a;
		   
          obj.b=30;
		System.out.println(c);
		System.out.println(b);
		//System.out.println(d);
		obj.SampleMethod();

	}

	static void SampleMethod() {

		System.out.println(b);
	}

	void helloMethod() {

	}

}

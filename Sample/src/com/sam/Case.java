package com.sam;

public class Case {
public static void main(String[] args) {
	
	int mark;
	int math=67;
	int tamil=52;
	int eng=69;
	
	int total=math+tamil+eng;
	
	int avg=total/3;
	
	if(avg>=80)
	{
		System.out.println("first mark");
	}
	
	else if(avg<=70)
	{
		System.out.println("second mark");
	}
	else
	{
		System.out.println("fail");
	}
}
}

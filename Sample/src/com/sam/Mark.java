package com.sam;

import java.util.Scanner;

public class Mark {
public static void main(String[] args) {
	Scanner obj=new Scanner(System.in);
	  
	System.out.println("enter 2 numbers");
	int math=obj.nextInt();
	int tamil=obj.nextInt();
	
	 int total=math+tamil;
	 int avg=total/2;
	 
	 System.out.println("total"+ total);
System.out.println("avg"+ avg);

if(avg<=100  && avg>70)
{
	System.out.println("destingtion");
}

else if(avg<=70 && avg>50) 
{
	System.out.println("first class");
}

else 
{
	System.out.println("fail");
}
}
}

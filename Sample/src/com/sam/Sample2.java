package com.sam;

import java.io.IOException;

public class Sample2 extends Thread
{
	int a;
	Sample2(int a)
	{
		this.a=a;
	}
	public void run()
	{
		super.run();
		
			for(int i=0;i<10;i++)
			{
				System.out.println("count"+ i+"thread"+a);
				
				//Thread.sleep(1000);
			}
				
		}}
	
	
	


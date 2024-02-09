package com.ebrain;



public class Loopobjectcreation {
	
		public void display()
		{
		int i=6;
		if(i==7)
		{
			for(i=1;i<=6;i++) {
				System.out.println(i);
			}
				
		}
		else {
			System.out.println("invalid");
		}
		
		
		
		
	}
		public static void main(String[] args) {
			Loopobjectcreation s3=new Loopobjectcreation();
			s3.display();
		}
}

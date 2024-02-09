package com.ebrain;



public class Pattern {
	
		public static void main(String[] args) {
			
			int r = 6;
			if(r==6)
			{
				for(int i = 0 ; i<=r-1;i++) {
					//    System.out.print("");
					for(int j = 0 ; j<=i;j++) {
						System.out.print(" ");
					}
					for(int k = 0 ;k<=r-1-i;k++) {
						System.out.print("*"+" ");
					}
					System.out.println();
				}
				
				
			}
			else
			{
				System.out.println("**********");
			}
			
		}
}


		
			
		

	




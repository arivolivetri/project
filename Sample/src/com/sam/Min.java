package com.sam;

public class Min {
public static void main(String[] args) {
	  int[] a = {45, 98, 23,79, 23};
	 
          int max1=a[0];
	          int max2=0;
	
	          for (int i = 1; i < a.length; i++) {
	              if (a[i] > max1) {
	                  max2 = max1;
	                  max1 = a[i];
	              } else if (a[i] > max2 ) 
	              {
	                  max2 = a[i];	        
	                  }
	 
          System.out.println( "max1="+  max1   +"  max2="+  max2);
	          }
}}


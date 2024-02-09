package com.ebrain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Arraycollection {
	public static void main(String[] args) {
		char arr[]= {'a','b','d','v','m'};
		System.out.println( "before a sorting "+ Arrays.toString(arr));
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
			
		{
		System.out.println( " after sorting "+ arr[i]);
		}
// COOLECTION:		
	//ARRAYLIST	
		
	System.out.println("****************************************");
	 
	System.out.println("ARRAY LIST.............");
	      ArrayList<Integer> obj=new ArrayList<Integer> ();
	      obj.add(377);
	      obj.add(2+6);
	      System.out.println("before sort " + obj);
	   Collections.sort(obj);
	   System.out.println("after sort" +obj);
	     
	 //LIST     
	   System.out.println("****************************************");  
	   System.out.println("LIST ..............");   
	          List obj1=new ArrayList();
	          obj1.add("ranjth" +" kumar");
	          obj1.add(123+432);
	System.out.println(obj1);
	//LINKEDLIST
	System.out.println("**************************************");
	
System.out.println(" LINKED LIST");
	LinkedList<String > list2 = new LinkedList<String>();  
	     list2.add("vijay");
	     list2.add("kalai");
	     list2.add("mano");
	     list2.add("priya");
	     list2.add("anu");
	     
	     System.out.println(list2);
	     // remove
	     list2.remove("kalai");
	     System.out.println(" removing list" + " " +list2);
	     //add first
	     list2.addFirst("aanandh");
	    System.out.println(" adding first" + " " +list2);
	    // add last
	    list2.addLast("preethi");
	    System.out.println("adding last" + "  "+list2);
	    
// SET
	    System.out.println("*********************************");
	    System.out.println("SET");
	    HashSet<Integer> data = new HashSet<Integer>();   
        data.add(27);   
        data.add(49);   
        data.add(30);  
        System.out.println("Set: " + data);  
	    
        //mapping ...........
        
        System.out.println("****************************");
        HashMap<Integer,String> wheel=new HashMap<Integer,String>();
        
        wheel.put(22,"bike");
        wheel.put(11, "car");
        System.out.println( "Hashmap" + " " +wheel);
        
       
        System.out.println( wheel.get(22));
        wheel.remove(22);
        System.out.println(wheel);
        
        
	}
}

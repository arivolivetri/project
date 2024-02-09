package com.sam;

public class New   
{  
  
public static String findMinWindow(String S1, String S2)   
{  
  
// In the beginning, the window is empty  
String empty = ""; 
int initialvalue  = 0; //strarr={abdferaabcdytsiihy   "abd"} 
int length= S1.length() + 1;  
  
for (int sv= 0; sv < S1.length(); sv++)   
{  
  
// If the characters of both the strings are the same, then increment the ptr2 pointer  
// ptr1 will get incremented itself, as ptr1 is the loop variable.  
if (S1.charAt(sv) == S2.charAt(initialvalue))   
{  
initialvalue =initialvalue+ 1;  
  
// the string S2 has been traversed completely. Therefore,  
// the time has come to shrink the window.  
if (initialvalue == S2.length())   
{  
int e = initialvalue + 1;  
initialvalue= initialvalue- 1;  
  
// Reducing the window size  
while (initialvalue >= 0)   
{  
if (S1.charAt(length) == S2.charAt(length))   
{  
	initialvalue = initialvalue - 1;  
}  
length = length - 1;  
}  
  
initialvalue = initialvalue + 1;  
length = length + 1;  
  
// we have found the window of lesser length  
// hence, we have to update the window  
if (e - length< length)   
{  
  
// Updating the var minimum  
	length = e - length;  
  
// Updating the window  
	//length = S1.substring(length, e);  
}  
}  
}  
}
return empty;  
      
//returning our final answer, which is stored in the window  
//return length; 
}
 
  
  
// main method  
public static void main(String argvs[])  
{  
// creating an object of the class DiffSubseqGCD   
New obj = new New();  
// input 1  
String s1 = "JavaTpoint";  
String s2 = "Tin";  
System.out.println("For the strings \"" + s1 + "\" and \"" + s2 + "\"");  
  
String str = obj.findMinWindow(s1, s2);  
System.out.println("The minimum window is : " + str);  
System.out.println();  
}}
package com.ebrain;

public class Addevennumber {
public static void main(String[] args) {
	int arr[]= {2,44,53,68,99,12};
	
	int evensum=0;
	System.out.println("The sum of all Even numbers:");
	 
    
    for (int i = 0; i < arr.length; i++) {

        if (arr[i] % 2 == 0) {

            if (evensum > 0) {
                System.out.print(" + " + arr[i]);
            } else {
                System.out.print(arr[i]);
            }

            evensum = evensum + arr[i];
        }
    }

    System.out.println(" = " + evensum);

}
}


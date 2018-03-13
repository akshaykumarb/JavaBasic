package com.ak;

import java.util.Scanner;

public class IFselection {

	public static void main(String[] args) {
		
 if(false)
	 System.out.println("Printing only If is true");

 
	
	Scanner s = new Scanner(System.in);
	
	int a = Integer.parseInt(s.nextLine());
	
	if(a%2==0)
	System.out.println("Even number");	
	else
		System.out.println("Odd number");	
	
	}
	
}

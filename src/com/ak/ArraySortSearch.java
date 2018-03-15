package com.ak;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySortSearch {
	
	
	public static void printArray(int array[])
	{
		for(int i=0; i<array.length;i++)
		{
			System.out.println("stored array  >>> "+ array[i]);
		}
	}
	
	 
   
	public static void main(String[] args) {
	 
		
		 int a[]= {100,400,500,200,-100,600,000,900};
		
		 
		
   Arrays.sort(a);
	   printArray(a);  //custom method
	  
	
	  Scanner obj = new Scanner(System.in);
	  System.out.println("Enter the Value to find the Index:");
	 System.out.println("Search result: " + Arrays.binarySearch(a,Integer.parseInt(obj.next())));
	  
  obj.close();
	}

}

package com.ak;

public class IterationForWhile {

	public static void main(String[] args) {
		
//		while(true) // infinite time
//		{
//			System.out.println("Prints infinite time");
//		}
		
		int j=10;
		int i=1;
		
		while (i<=6)
		{
			System.out.println("Its more than five");
			i++;
		}
	
		//***********************
		
		do // condition is checked later
		{
			
			System.out.println("while print atleast once!");
			j++;
			 
		}
		while(j<=6);
		
		//************************
		
		for(int k=1;k<=5;k++) // when you know start and end then choose for loop
		{
			System.out.println("For Loop test");
		}
		
		
		
		//******* Nested Loop *********
		
		// print this
//		* * * *
//		* * * *
//		* * * *
//		* * * *
	
//		for(int y=0; y<=3;y++)
//		{
//	for (int x=0; x<=3;x++)	
//	{
//		 System.out.print("* ");
//	}	
// 	System.out.println();	
//		}
	 
	
	
		for(int y=0; y<=4;y++)
		{
		
	for (int x1=0; x1<=y;x1++)	
	{
		
		System.out.print(x1+" ");
	
		
	}	
	System.out.println();
		}
	
	
	
	
	
	
	}


 

}

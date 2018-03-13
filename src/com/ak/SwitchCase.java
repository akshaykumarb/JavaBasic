package com.ak;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a =0;
		int b=5;
		
		b=a<1?3:4; //ternary operator
		
//		System.out.println(b);
		
		System.out.println("Enter the number :");
		
		Scanner s = new Scanner(System.in);
		b = Integer.parseInt( s.nextLine());
 
		switch(b)
		{
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		case 4:
			System.out.println("four");
			break;
		case 5:
			System.out.println("Five");
			break;
			default:
				System.out.println("Default Avaliable!!");
				break;
		}
		
		
		
		
	}

}

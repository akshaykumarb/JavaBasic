package com.ak;

public class Operator {
	
//	Arithmetic 
//	Bitwise
//	Relational
//  Logical

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int m=6,n=2;
		 
		 int r1= m+n;
		 int r2 = m-n;
		 int r3=m/n;
		 int r4=m%n;
		 
		 System.out.println(r1);
		 System.out.println(r2);
		 System.out.println(r3);
		 System.out.println(r4);
		 
		 n +=m; //same as n = n + m; 
		 n++; // same as n +=1; n= n+1;  - post increment
		 ++n; // pre increment 

	}

}

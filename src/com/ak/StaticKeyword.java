package com.ak;

public class StaticKeyword {
	
	static  // invoked all the time
	{
		System.out.println("in static block!");
	}

	StaticKeyword() // contructor invoked only when object is created
	{
		System.out.println("in Constructor");
	}
	public static void main(String[] args) {
	 
	 	StaticKeyword s = new StaticKeyword();
	
	
	}

}

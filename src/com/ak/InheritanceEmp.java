package com.ak;

class Calcs  //super class
{
	public void addtion(int a, int b)
	{
		System.out.println("Addtion:  "+(a+b));
	}
	
	public void subtract(int a, int b)
	{
		System.out.println("Subtraction: "+(a-b));
	}
	
	
	public void otherMethod()
	{
		System.out.println("Called from Super");
	}
}


public class InheritanceEmp extends Calcs {  // subclass
	
	public void otherMethod()
	{
		System.out.println("Called from main method");
	}

	
	public void customMethod()
	{
		super.otherMethod(); //super keyword  calls the method of the super class
	}
	public static void main(String[] args) {

		InheritanceEmp obj = new  InheritanceEmp();
		obj.addtion(10, 20);
		obj.subtract(68, 8);
		
		obj.otherMethod(); // calls the main method class
		
		 obj.customMethod();

	}

}

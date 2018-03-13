package com.ak;

class Calc
{
	int a;
	int b;
	int c;
	
		void perform()
		{
			 c=a +b;	
		}
}





public class ClassObject {

	public static void main(String[] args) {
		 
		Calc obj = new Calc();
		
		obj.a = 10;
		obj.b=12;
		obj.perform();
		
		System.out.println(obj.c);

	}

}

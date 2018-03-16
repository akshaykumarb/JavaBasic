package com.ak;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FilesIO {
	
	
	

	public static void main(String[] args) {
		FileInputStream readObj =null;
		FileOutputStream writeObj=null;
 
		try
		{
			readObj = new FileInputStream("read.txt");
			 writeObj= new FileOutputStream("write.txt");
			
		System.out.println("Content from read file  "+readObj.read());	
		int c=0;
		while((c=readObj.read())!=-1)
		{
			writeObj.write(c);
		}
			
			
		} catch (FileNotFoundException e) {
			 
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		finally
		{
			
		}
	}

}

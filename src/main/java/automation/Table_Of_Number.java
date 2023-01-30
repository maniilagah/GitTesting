package automation;

import java.util.Scanner;

public class Table_Of_Number {
	
	public static void main(String args[])
	{
		
		 Scanner myObj = new Scanner(System.in);  
		 System.out.println("Enter any integer number you want the table for");
	
		  int value = myObj.nextInt();
		  myObj.close();	
		
		  for(int i = 1; i<= 20 ; i++)
		  {
			  
		System.out.println(value + " * " + i + " = " + i*value );	  
		  }
		  
	}
	

}

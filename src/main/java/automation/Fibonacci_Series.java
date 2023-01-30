package automation;

import java.util.Scanner;

public class Fibonacci_Series {
	
	public static void main(String args[])
	{
	
	System.out.println("enter till which number you want to have Fibnacci numbers");
	Scanner myObj = new Scanner(System.in); 
	int  value = myObj.nextInt();
	
	int secondLast_Number1 = 0;
	int last_Number = 1;
	int nextNumber = 0;
	System.out.print( secondLast_Number1 + " " + last_Number + " ");
	for(int i =0; i<= value-2; i++)
	{
		
		nextNumber = secondLast_Number1 + last_Number;
		secondLast_Number1 = last_Number;
		last_Number = nextNumber;
		
		
		System.out.print( nextNumber + " ");
	}
	
	myObj.close();
	}
	}
	



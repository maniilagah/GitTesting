package automation;

import java.util.Scanner;

public class Even_Number {

	
	public static void main(String args[])
	{
		
	System.out.println("Enter the number till when you need even numbers");
	Scanner myObj = new Scanner(System.in);  
	int n = myObj.nextInt();
	
	for (int i = 1 ; i<= n ; i++)
	{
		
	if (i%2==0)
	{
	System.out.println( i );	
	}
		
	}
	
	myObj.close();
	}
}

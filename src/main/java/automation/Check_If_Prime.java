package automation;

import java.util.Scanner;

public class Check_If_Prime {

	public static void main(String args[])
	{
		System.out.println("Enter number to check if it is prime number or not");
		Scanner myObj = new Scanner(System.in); 
		int value = myObj.nextInt();
		int count = 0;	
	if (value>1)
	{
		for(int i=1; i<= value/2 ; i++ )
			{
					if( value%i==0)
					{
					count++;
					if (count>1)
					{
						break;
					}								
					}					
			}
	}
		if (count == 1)
		{
	System.out.print(value + " is a prime number.");

		}
		else
		{ 
			System.out.print(value + " is not a prime number.");
		}
		myObj.close();
	
	}	
	
	
	
	
}

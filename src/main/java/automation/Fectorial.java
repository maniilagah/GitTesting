package automation;

import java.util.Scanner;

public class Fectorial {
	
	
	public static void main (String arg[])
	{
		
		
		
		Scanner myObj = new Scanner(System.in); 
		
		System.out.println("Please enter any positive integer value to find the factorial");
		int value = myObj.nextInt();
		int answer=1;
		for(int i=value; i>=1;i--)
		{
		
		answer = answer*i;
			
		}
		
		
		System.out.println("Factorial of " + value + " is " + answer);
		myObj.close();
	}

}

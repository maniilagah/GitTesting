package automation;

import java.util.Scanner;

public class ReverseNumber {

	
	public static void main (String arg[])
	{
		
		
		
		Scanner myObj = new Scanner(System.in); 
		
		System.out.println("Please enter any positive integer value to find the factorial");
		int value = myObj.nextInt();
		int reverse = 0;
		while(value!=0)
		{
		reverse = reverse*10 + value%10;
		value = value/10;
			
		}
		
		System.out.println("answer is " + reverse);
		myObj.close();
	}
	
}

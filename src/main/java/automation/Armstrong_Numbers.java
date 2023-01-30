package automation;

import java.util.Scanner;

public class Armstrong_Numbers {
	public static void main(String args[])
	{
	
	System.out.println("enter till which number you want to have armstrong number");
	Scanner myObj = new Scanner(System.in); 
	int  value = myObj.nextInt();
	
	for(int i =1; i<= value; i++)
	{
		int number = i;
		int singleDigit = 0;
		int sum = 0;

	while(number!=0)
	{
		singleDigit = number%10;
		sum = sum +  singleDigit*singleDigit*singleDigit;
		number = number/10;
		
	}	
		
	if (sum == i)
	{
		System.out.println("number is armstrong ... num and sum is " + i + " " + sum );
		
	}
	
		
	
	}
	myObj.close();	
	}
	
}

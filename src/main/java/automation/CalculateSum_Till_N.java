package automation;

import java.util.Scanner;

public class CalculateSum_Till_N {
	
//	Write a program to calculate the sum of following series where n is input by user. 
//	1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n 

	
	public static void main(String args[])
	{
	
	System.out.println("enter till which number you want to have sum of (1/n) numbers");
	Scanner myObj = new Scanner(System.in); 
	int  value = myObj.nextInt();
	
	double sum = 0;
	
	for (float i=1;i<=value;i++)
	{
	
	sum = sum + (1/i);	
	}
	System.out.println(" the sum of this series 1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n till " + " " + value + " " + "is " + sum);
	
	myObj.close();	
	}
	

}

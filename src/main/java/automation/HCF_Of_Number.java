package automation;

import java.util.Scanner;

public class HCF_Of_Number {

	public static void HCF_is(int a)
	{
		System.out.println("HCF is " + a);	
	}
	
	public static void main(String args[])
	{
	System.out.println("You have to enter 2 postive integer values to get a HCF");
	Scanner myObj = new Scanner(System.in); 
	int  value1 = myObj.nextInt();
	int  value2 = myObj.nextInt();
	
	int newFactor = 0;
	
		
	for (int i =1; i<= value1 && i<=value2; i++)
	{
		if (  value1%i == 0 && value2%i == 0)
		{
		newFactor = i;
			}
		
		}
	
	HCF_is(newFactor);
	myObj.close();
	
	
	}
	
	
	
}


package automation;

import java.util.Scanner;

public class PowerOf_Number {
	
	public static void main (String arg[])
	{
		
	
	Scanner myObj = new Scanner(System.in); 
	System.out.println("In this program you will enter 2 positive int numbers and the value of "
			+ "one number will be raised to the power of another ");
	int value = myObj.nextInt();
	
	int value2 = myObj.nextInt();
	
	int answer = 1;
	
	if (value2 != 0)
	{
	for (int i = 1; i<= value2 ; i++)
	{
		
		answer = answer * value2;
		
	}
	
	
	}
	else
	{
		answer = 1;
	}
	
	System.out.println("Number " + value + " was raised to the power " + value2 + " The answer is " + answer);
	myObj.close();
}
	

}

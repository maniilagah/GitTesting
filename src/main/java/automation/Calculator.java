package automation;

import java.util.Scanner;

public class Calculator {
	
	/*	Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows : 
		•	+ (Addition) a + b
		•	- (Subtraction) a – b
		•	* (Multiplication) a * b
		•	/ (Division) a / b
		•	% (Modulo or remainder) a % b
		Calculate the result according to the operation given and display it to the user.
		
		*/
	
	public static void main (String args[])
	{
		

	Scanner myObj = new Scanner(System.in);  
	System.out.println("You have to enter 2 values on which you want to perform calculation");
	
	System.out.println("Enter first value");
	float first_Value = myObj.nextFloat();
	
	System.out.println("Enter seond value");
	float second_Value = myObj.nextFloat();
	
	System.out.println("Now enter the value from down blow according to the calculation you want to do \r\n" 
							+ "		•	+ (Addition) a + b\r\n"
							+ "		•	- (Subtraction) a – b\r\n"
							+ "		•	* (Multiplication) a * b\r\n"
							+ "		•	/ (Division) a / b\r\n"
							+ "		•	% (Modulo or remainder) a % b");
	
	
	
	
	Scanner for_String_Value= new Scanner(System.in);
	String opration_Value = (for_String_Value.nextLine()).intern();
	System.out.println("the opration you selected is " +  opration_Value);

	
	if (opration_Value == "+")
	{
	
	System.out.println("The addition of " + first_Value + " and " + second_Value + "is = " + (first_Value + second_Value));
		
	}
	else if(opration_Value == "-")
	{
	System.out.println("The substraction of " + first_Value + " and " + second_Value + "is = " + (first_Value - second_Value));

	}
	else if(opration_Value == "*")
	{
	System.out.println("The multipication of " + first_Value + " and " + second_Value + "is = " + (first_Value * second_Value));

	}
	else if(opration_Value == "/")
	{
	
	System.out.println("The division of " + first_Value + " and " + second_Value + "is = " + (first_Value / second_Value));

	}
	else if (opration_Value == "%")
	{
	System.out.println("The remainder of " + first_Value + " and " + second_Value + "is = " + (first_Value % second_Value));

	}

	else
	{
		System.out.println(" Wrong input please try agian later");
		
	}
	
	for_String_Value.close();
	myObj.close();	
		
	}
	
	
	

}

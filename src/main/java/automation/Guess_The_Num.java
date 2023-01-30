package automation;

import java.util.Scanner;

public class Guess_The_Num {

	
	public static void main(String args[])
	{
		

		Scanner myObj = new Scanner(System.in); 
		int guessed_Value;
		int random_Number = (int) (Math.random() * 100) + 1; 
	
	do
	{
		
		System.out.println("Please enter the number");
		guessed_Value = myObj.nextInt();
		if (guessed_Value < random_Number)
		{
			System.out.println("Try again.. number you entered is low ");
		}
		else if (guessed_Value > random_Number)
		{
			System.out.println("Try again.. number you entered is high ");
			
			}
		else
		{
			System.out.println("congratulation you guessed right number ");
			
		}	
	}while(guessed_Value!= random_Number);	

	myObj.close();	
	}
	
}

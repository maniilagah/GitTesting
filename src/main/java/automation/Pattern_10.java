package automation;

import java.util.Scanner;

public class Pattern_10 {

	
	
	public static void main (String arg[])
	{
		
		System.out.println("Enter odd number of rows you want");
		
		Scanner myObj = new Scanner(System.in); 
		int value = myObj.nextInt();
		
		int newValue = (value-1)/2;
		int valurForColumn= value;
		for (int i = 1; i <= (value+1)/2 ; i++)
		{
			
			for (int j = 1; j <= valurForColumn ; j++)
			{
				if ( j > newValue)
				{
				System.out.print("*");
				}
				else
				{
					System.out.print(" ");
					
				}
				
			}
			newValue--;
			valurForColumn--;
			System.out.println();
		}
		myObj.close();
		
	}
	
	
}

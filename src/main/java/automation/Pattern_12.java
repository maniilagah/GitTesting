package automation;

import java.util.Scanner;

public class Pattern_12 {

	/*
	 
	  1
     212
    32123
   4321234
  543212345
 65432123456
7654321234567
	 
	 */
	
	
	
	public static void main(String args[])
	{
		System.out.println("Enter odd number of rows you want");
		
		Scanner myObj = new Scanner(System.in); 
		int rows = myObj.nextInt();	
		int columns = rows;
		int spaceCounter = rows-1;
		boolean lowestReached = true;
		for(int i=1; i<=rows; i++)
		{
			
			int valueToPrint = i;
			lowestReached = false;
			for (int j=1; j<=columns; j++)
			{
			
			if (j>spaceCounter)
			{
				System.out.print( valueToPrint);
				
				if (valueToPrint == 1)
				{
					
					lowestReached = true;
				}
				
				if ( lowestReached && i != 1)
				{
					valueToPrint++;
				}
				else
				{
					valueToPrint--;
				}
				
				
				
			}
			else
			{
				System.out.print(" ");
				
			}
				
			}
			columns++;
			spaceCounter--;
			System.out.println();
		}
		
		
		myObj.close();	
	}
}

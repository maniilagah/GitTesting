package automation;

import java.util.Scanner;

public class Pattern_11 {

	
	/*
	 
	  1
     2 2
    3 3 3
   4 4 4 4
  5 5 5 5 5
 6 6 6 6 6 6
7 7 7 7 7 7 7
	 
	 
	
	 */
	
	
	
	public static void main (String arg[])
	{
		
		System.out.println("Enter odd number of rows you want");
		
		Scanner myObj = new Scanner(System.in); 
		int rows = myObj.nextInt();
		
		int columns = rows;
		int spaceCounter = columns-1;
		
		for (int i = 1; i <= rows ; i++)
		{
			boolean spaceInbetween = false;
			for (int j = 1; j <= columns ; j++)
			{
				if(j<= spaceCounter)
				{
					
					System.out.print(" ");
				}
				else
				{
					if (spaceInbetween)
					{
						
					System.out.print(" ");
					spaceInbetween = false;
					}
					else
					{
						
					System.out.print(i);
					
					spaceInbetween = true;
						
					}
					
				}		
				
			}
			columns++;
			spaceCounter--;
			System.out.println();
		}
		
		myObj.close();	
		
	}
}

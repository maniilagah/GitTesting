package automation;

import java.util.Scanner;

public class Pattern_9 {

	/*
	 
	1 
 	0  1 
 	0  1  0 
 	1  0  1  0 
 	1  0  1  0  1
	 
	 */
	
	
	
	public static void main (String arg[])
	{
		
		System.out.println("Enter thre number of rows you want");
		
		Scanner myObj = new Scanner(System.in); 
		int value = myObj.nextInt();
		int count = 1;
		
		for (int i = 1; i <= value ; i++)
		{
			
			
			for (int j = 1; j <= i ; j++)
			{
				if (count == 1)
				{
					System.out.print(" " + count-- + " ");
				}
				else
				{
					System.out.print(" " + count++ + " ");
				}
				
				
			}
			
			System.out.println();
		}
		
		
		myObj.close();		
	}
	
	
	
}

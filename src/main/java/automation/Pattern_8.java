package automation;

import java.util.Scanner;

public class Pattern_8 {
	
	
	
	/*
	 	1 
 		2  3 
 		4  5  6 
 		7  8  9  10 
 		11  12  13  14  15
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
				
				System.out.print(" " + count++ + " ");
			}
			
			System.out.println();
		}
		
		
		myObj.close();		
	}

}

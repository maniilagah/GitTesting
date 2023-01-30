package automation;

import java.util.Scanner;

public class Pattern_6 {
	
	/*
	 
	1 
 	1  2 
 	1  2  3 
 	1  2  3  4 
 	1  2  3  4  5 
 	1  2  3  4  5  6 
	 
	 
	 */
	
	
	
	public static void main (String arg[])
	{
		
		System.out.println("Enter thre number of rows you want");
		
		Scanner myObj = new Scanner(System.in); 
		int value = myObj.nextInt();
		
		for (int i = 1; i<= value ; i++)
		{
			for (int j = 1; j<= i ; j++)
			{
				System.out.print(" " + j + " ");
				
			}
			System.out.println();
			
		}
		
		myObj.close();	
	}

}

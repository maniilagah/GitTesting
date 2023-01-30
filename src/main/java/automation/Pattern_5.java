package automation;

import java.util.Scanner;

public class Pattern_5 {
	
	/*
	  
	              * 
	           *  * 
	        *  *  * 
	     *  *  *  * 
	  *  *  *  *  *  
	 
	 */
	
	
	
	public static void main (String arg[])
	{
		
		System.out.println("Enter thre number of rows you want");
		
		Scanner myObj = new Scanner(System.in); 
		int value = myObj.nextInt();
		int newValue = value;
		for (int i = 1; i<= value ; i++)
		{
			for (int j = 1; j<= value ; j++)
			{

				if(j >= newValue)
				{
				System.out.print(" * ");
				
				}
				else
				{
					System.out.print("   ");
				}					
			}
			newValue--;
			System.out.println();
			
		}
		myObj.close();
	}

}

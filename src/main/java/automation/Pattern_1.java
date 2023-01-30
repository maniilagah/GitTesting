package automation;

import java.util.Scanner;

public class Pattern_1 {
	
	
	
	
/*	 *  *  *  * 
	 *  *  *  * 
	 *  *  *  * 
	 *  *  *  * 
*/
	public static void main (String arg[])
	{
		
		System.out.println("Enter thre number of rows you want");
		
		Scanner myObj = new Scanner(System.in); 
		int value = myObj.nextInt();
		
		for (int i = 1; i<= value ; i++)
		{
			for (int j = 1; j<= value ; j++)
			{
				System.out.print(" * ");
				
			}
			System.out.println();
			
		}
		myObj.close();
		
	}

}

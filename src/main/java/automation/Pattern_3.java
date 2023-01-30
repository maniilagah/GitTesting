package automation;

import java.util.Scanner;

public class Pattern_3 {
	
	
	
	/* print below pattern
	 
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
		
		for (int i = 1; i<= value ; i++)
		{
			for (int j = 1; j<= i ; j++)
			{
				System.out.print(" * ");
				
			}
			System.out.println();
			
		}
		
		myObj.close();	
	}

}

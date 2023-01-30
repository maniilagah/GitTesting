package automation;

import java.util.Scanner;

public class Prime_Numbers {
	
	public static void main(String args[])
	{
		
		
		System.out.println("Enter till what number you want tp print prime numbers");
		
		Scanner myObj = new Scanner(System.in); 
		int value = myObj.nextInt();

			
		int count = 0;
		
		
		if (value < 2)
		{
			System.out.print(" No prime number exists");
		}
		else
		{
			
			for(int i=1; i<= value ; i++ )
			{
				count = 0;
			
				for (int j = 1; j<=i/2; j++)
				{					
						
					if( i%j==0)
					{
						count++;
						
						if (count>1)
						{
							break;
						}
					}

					
				}		
				if (count == 1)
						{
					System.out.print(" prime number is = " + i + " ");

						}
			}
			
			
		}
		
	
		myObj.close();
	}	
	
	
	
	

}

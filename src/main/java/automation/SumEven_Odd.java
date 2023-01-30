package automation;

import java.util.Scanner;

public class SumEven_Odd {

	
	public static void main (String arg[])
	{
		
	Scanner myObj = new Scanner(System.in); 
	
	int moreInput=1;
	
	int sumOf_OddNumbers = 0;
	int sumOf_EvenNumbers = 0;
	
	do{
		
		System.out.println("You can enter any integer values from the keyboard");
		
		int  value = myObj.nextInt();
		
		if(value%2==0)
		{
			sumOf_EvenNumbers = sumOf_EvenNumbers+value;
		}
		else
		{
			sumOf_OddNumbers = sumOf_OddNumbers + value;
			
		}
				
	System.out.println("If You want to enter more integer then press 1 and if not then press 0 from the keyboard ");
	
	moreInput = myObj.nextInt();
	
	}
	while(moreInput == 1);
	System.out.println("the sum even values are " +  sumOf_EvenNumbers);
	System.out.println("the sum odd values are " +  sumOf_OddNumbers);
	
	myObj.close();
	
	
	}
	
}

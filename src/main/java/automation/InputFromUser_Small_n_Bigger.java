package automation;

import java.util.Scanner;

public class InputFromUser_Small_n_Bigger {
	
	
	public static void main (String arg[])
	{
		
	Scanner myObj = new Scanner(System.in); 
	
	int moreInput=1;
	
	int bigger = 0;
	int smaller = 0;
	System.out.println("You can enter integer values from the keyboard");
	do{
		
		
		
		int  value = myObj.nextInt();
		
		if(bigger <= value)
		{
			bigger = value;
		}
		else if(smaller >= value)
		{
			smaller = value;
			
		}
		
				
	System.out.println("If You want to enter more integer then press 1 and if not then press 0 from the keyboard ");
	
	moreInput = myObj.nextInt();
	
	}
	while(moreInput == 1);
	System.out.println("bigger number  from the list is " +  bigger);
	System.out.println("smaller number fro the list is " +  smaller);
	
	
	
	myObj.close();
	}
	

}

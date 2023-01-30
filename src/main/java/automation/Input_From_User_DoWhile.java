package automation;

import java.util.Scanner;

public class Input_From_User_DoWhile {
	
	

	public static void main (String arg[])
	{
		
	Scanner myObj = new Scanner(System.in); 
	int moreInput = 0;
	
	
	do{
		
		System.out.println("You can enter 2 from the keyboard");
		
		int  value1 = myObj.nextInt();
		int  value2 = myObj.nextInt();
		System.out.println("the sum even values are " +  (value1 + value2));
				
	System.out.println("If You want to this operation again then press 1 and if not then press 0 from the keyboard ");
	
	moreInput = myObj.nextInt();
	
	}
	while(moreInput == 1);
	
	
	System.out.println("The program has ended");
	
	myObj.close();
	}

}

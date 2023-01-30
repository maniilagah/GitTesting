package automation;

import java.util.Scanner;

public class Natural_Log_of2 {
	
	public static void main(String args[])
	{
	
//		Compute the natural logarithm of 2, by adding up to n terms in the series
//		1 - 1/2 + 1/3 - 1/4 + 1/5 -... 1/n
		

		
System.out.println("Compute the natural logarithm of 2, by adding up to n terms in the series\r\n"
			+ "//	1 - 1/2 + 1/3 - 1/4 + 1/5 -... 1/n");
	Scanner myObj = new Scanner(System.in); 
	int  value = myObj.nextInt();
	double sum = 0;
	boolean pos_neg = true;
	for (int i=1;i<=value;i++)
	{
		if (pos_neg)
		{
			sum = sum + (1.0/i);	
			pos_neg = false;
		}
		else
		{
			sum = sum - (1.0/i);	
			pos_neg = true;
		}
	}
	
	System.out.println("the answer is " + sum);
	myObj.close();
}

}
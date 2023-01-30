package ArrayPractice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Return_Fibnacci_Array {

	public static void main(String[] args) {
		
		

		
		System.out.println("The series is " + Arrays.toString(getFibbnacci(3)));
	}
	
	public static int[] getFibbnacci(int n)
	{
		
		int first=0;
		int second=1;
		int result[] = new int[n];
		if(n>2)
		{
			
			result[0] = 0;
			result[1] = 1;
			
			for(int i=2;i<=n-1;i++)
			{
				
				result[i]=first+second;
				first = second;
				second = result[i];	
			}
			
			return result;		
		}
		else if(n==1)
		{
			result[0] = 0;
			return result;
		}
		else if(n==2)
		{
			result[0] = 0;
			result[1] = 1;
			return result;
		}
		
		else
		{
			result[0] = 0;
			return result;
		}
		
	}

}

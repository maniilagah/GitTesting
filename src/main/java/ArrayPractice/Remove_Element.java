package ArrayPractice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Remove_Element {

	public static void main(String[] args) {
		
		
		int[] array_Of_Numbers = {3,54,42,45,1,45,5,6,76,56,7,55};
		
		
		
		System.out.println("The old array was " + Arrays.toString(array_Of_Numbers));
		System.out.print("The new array is " + Arrays.toString(removeElementFromArray(5,array_Of_Numbers)));

	}

	
	public static int[] removeElementFromArray(int number,int[] a)
	{
		
		int[] newArray = new int[a.length-1];
		int k = 0;
		for(int i=0;i<=a.length-1;i++)
		{
			
		if(a[i] == number)
		{
			
		continue;
			
			
		}
		else
		{
			newArray[k] = a[i];
			k++;
		}
			
		}
		return newArray;
		
	}
}

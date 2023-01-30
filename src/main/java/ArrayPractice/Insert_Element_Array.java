package ArrayPractice;

import java.util.Arrays;

public class Insert_Element_Array {

	public static void main(String[] args) {
		

		
		int number[] = {1,23,31,34,23,31,42,54,35,23,42,12,423,234};
		insert_Element_Array(14,5,number);
	}
	
	public static void insert_Element_Array(int index,int number,int[] a)
	
	{
	
		
		int[] finalArray = new int[a.length+1];
		int k =0;
		
		System.out.println("The before insertion was " + Arrays.toString(a));
		
		for(int i=0;i<=a.length;i++)
		{
			
		if(i==index)
		{
		
			finalArray[i] = number;
			
		}
		else
		{
			finalArray[i] = a[k];
			k++;
		}
			
		}
		System.out.println("The after insertion is " + Arrays.toString(finalArray));
		
		
		
		
	}
	
	

}

package ArrayPractice;

import java.util.Arrays;

public class ArrayIntro {
	
	
	public static void main(String[] args) {
		
		//Write a Java program to sort a numeric array and a string array.
		
		
		int unsortedArray [] = {13,5,23,1,0,34,67,65,43,7,6,54,245,675,753,6756,30,43,3};
		int new arrayTest [] = {4,4};
		
		int length = unsortedArray.length-1;
		int pos = length-1;
		
		for(int i=0;i<=length;i++)
		{
			System.out.println("The value at " + i + " " + unsortedArray[i]);
			for(int j=0; j<=pos;j++)
			{
			if(unsortedArray[j] > unsortedArray[j+1])
			{
			int temp = unsortedArray[j+1];
			unsortedArray[j+1] = unsortedArray[j];
			unsortedArray[j] = temp;
			}
			}
			
			pos--; 

		}
		
		System.out.println("The array is" + Arrays.toString(unsortedArray));
		
	}

}

package ArrayPractice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LargestGap_Array {

	public static void main(String[] args) {
		
		
		int[] array = {3,5,6,4,2,-6,54,54,-243,-664,64,32,56,765,32,-6};
		
		for(int i=0 ; i<=array.length-2;i++)
		{
			
			for(int j=i+1;j<=array.length-1;j++)
			{
				if(array[i]>array[j])
				{
				int temp = array[j];
				array[j] = array[i];
				array[i] = temp;
				}		
			}		
		}
		System.out.println(Arrays.toString(array));
		
		
		int temp=0;
		for(int i = 0; i<=array.length-2; i++)
		{
			
			if(array[i+1]-array[i]>temp)
			{
		
			temp=array[i+1]-array[i];	
				
			}
			
			
		}
		
		System.out.println("The biggest difference is " + temp);
	}

}

package ArrayPractice;

import java.util.Arrays;

public class ConsectiveNumber_InArray {

	public static void main(String[] args) {
		
		
		int[] array = {2,3,4,1,5,7,6};
		System.out.print(containConsectiveNumber(array) + " All values are consective");		
	}

	
	public static Boolean containConsectiveNumber(int[] a)
	{
		boolean flag = true;
		for(int i=0; i<=a.length-2;i++)
		{	
			for(int j = i+1; j<=a.length-1;j++)
			{
				if(a[i]>a[j])
				{
					int temp =a[j];
					a[j] =a[i];
					a[i] = temp;
					
				}	
			}	
			
		}
		
		for(int i=0;i<=a.length-2;i++)
		{
		
		if(a[i+1]-a[i]!=1)
		{
			flag = false;
			break;
		
		}	
			
		}
		
		System.out.println(Arrays.toString(a));
		
		return flag;
		
		
	}
}

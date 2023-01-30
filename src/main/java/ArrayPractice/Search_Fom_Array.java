package ArrayPractice;

public class Search_Fom_Array {

	public static void main(String[] args) {
		
		int number[] = {1,23,31,34,23,31,42,54,35,23,42,12,423,234};
		searchElementFrom(234,number);
	
	}
	
	public static void searchElementFrom(int element,int[] a)
	{
		Boolean flag = false;
	for(int i=0;i<=a.length-1;i++)
	{
	
		if(a[i]==element)
		{
		System.out.print("The value " + element + " was found at Array index " + i);	
		flag = true;
		break;
			
		}
		
		
	}
	
	if (flag==false)
			{
		System.out.print("SORRY! The value " + element + " was not found in the Array");	
			}
		
	}

}

package oops_Programs;

class GetBiggestNumber{

	int first_Number;
	int second_Number;
	int third_number;
	static int biggest;
	
	public static void getBiggest(int x, int y, int z)
	{
		if (x>y && x>z)
		
		{
			biggest = x;
			
		}
		
		else if(y>z)
		{
			
			biggest = y;
		}
		else
		{
		
			biggest = z;
		}
		
	}
	
	
}

public class Static_Methods {
	
	public static void main(String args[])
	{
	
		GetBiggestNumber.getBiggest(23,54,34);
		System.out.println("The biges number is " + GetBiggestNumber.biggest);
	
	}

}

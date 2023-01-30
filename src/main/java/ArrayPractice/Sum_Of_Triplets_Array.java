package ArrayPractice;

public class Sum_Of_Triplets_Array {

	public static void main(String[] args) {
		
		int[] array = {1,32,12,33,12,3,3,11,3,2,4,2,1,3,4,0,3,5,6,1,0};
		
		for(int i=0;i<=array.length-3;i++)
		{
		if(array[i]+array[i+1]+array[i+2]==7)
		{
				
	System.out.println("we found triplet with sum of 7 and those values are " + array[i]+ " " + array[i+1] + " " + array[i+2] );
				
	}
			
		}
		

	}

}

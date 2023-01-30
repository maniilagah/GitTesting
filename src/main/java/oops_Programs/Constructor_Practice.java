package oops_Programs;

 class AreaRectangle{
	 
	 float length;
	 float breath;
	  
	AreaRectangle(float x, float y)
	{
		length = x;
		breath = y;	
	}
	public float areaCalculator()
	{
		return length*breath;	
	}
	} 
 	public class Constructor_Practice {

	public static void main (String args[])
	{
		AreaRectangle area1 = new AreaRectangle(43.9f,87.0f);
		System.out.println("Area of the rectangle is " + area1.areaCalculator());
		
	}
	       

}


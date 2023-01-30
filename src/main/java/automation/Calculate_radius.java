package automation;
import java.util.Scanner;

public class Calculate_radius {
	
	public static void main(String args[])
	{
		
		 Scanner myObj = new Scanner(System.in);  
		 System.out.println("To calculate area of the cricle please enter the value of the radius");
	
		  float radius_value = myObj.nextFloat();
		  myObj.close();
		  float answer = 3.14f * (radius_value * radius_value);
		  System.out.println("Area of the circle is " + answer);
	
		  myObj.close();	
				  
	}

}

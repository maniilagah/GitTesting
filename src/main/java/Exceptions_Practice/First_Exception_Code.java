package Exceptions_Practice;

public class First_Exception_Code {

	public static void main(String[] args) {
		
		substractTwoNumbers();
		divideTwoNumbers();
		multiplyTwoNumbers();
		
	}
	
	public static void divideTwoNumbers() 
	{
		
	
		try {
			int g =3/0;	
			System.out.println("The value of divide is " + g);
			throw new ArithmeticException();
		}
	
		
		catch(ArithmeticException e )
		{
			
		System.out.println("The arithmetice exception occured " + e);
		}
		
		finally
		{
			System.out.println("The is finally block ");
		}
	
	}
	
	public static void substractTwoNumbers()
	{
		int h = 4-5;
		System.out.println("The value of substraction is is " + h);
		
	}
	
	public static void multiplyTwoNumbers()
	{
		int g = 5*6;
		System.out.println("The value of multiply is " + g);
		
	}

}

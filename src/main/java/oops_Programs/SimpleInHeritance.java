package oops_Programs;

class Room{
	
int length;
int breath;
Room(int a,int b)
{
	length=a;
	breath=b;
	
	}
public int area()
{

	return length*breath;
	
}

}

class Bedroom extends Room
{
	
	int height;
	
	Bedroom(int a, int b, int c)
	{
		super(b,c);
		height = c;
		
		
	}
	
	public int volumn()
	{
		
		return length*breath*height;
	}
	
	
}


public class SimpleInHeritance {

	public static void main(String[] args) {
		
		
		Bedroom room1 = new Bedroom(23,54,32);
		System.out.println("The are of the room is " + room1.area());
		System.out.println("The volumn of the the room is " + room1.volumn());
		

	}

}

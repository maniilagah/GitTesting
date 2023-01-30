package oops_Programs;

class Student
{	
	String name;
	Student()
	{
	name = "UnKnown";
	
	}
	Student(String n)
	{
		name = n;
	System.out.println("The name of the student is " + n);
		
	}
	
}

public class Cons_Overloading_StudentInfo {
	
	public static void main(String[] args) {
		
		
			Student student1 = new Student();
			
			System.out.println("The name of the student is " + student1.name);
			
			Student student2 = new Student("Manish Kumar");
			System.out.println("The name of the student is " + student2.name);
	}

}

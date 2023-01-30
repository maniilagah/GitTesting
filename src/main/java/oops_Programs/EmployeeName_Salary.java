package oops_Programs;

class Employee {
	String Employee_name;
	 int Employee_salary;
	 
	 public void setName(String n)
	 {
		 Employee_name = n;
		 
	 }
	 public void setSalary(int s)
	 {
		 Employee_salary = s;
	 }
	 
	 public String getName()
	 
	 {
		 return Employee_name;
	 }
	 
	public int getSalary()
	
	{
	return Employee_salary;	
	}
		
	
}
public class EmployeeName_Salary {


	 public static void main(String args[])
	 {
		 
		 
//		 Employee employee_First = new Employee();
//		 
//		 employee_First.setName("Manish Kumar");
//		 employee_First.setSalary(34);
//		 System.out.println("Name of the employee is " + employee_First.getName());
//		 System.out.println("Salary is " + employee_First.getSalary());

		 
		 
		 // we can assign one object to another to share same reference
		 
		 
		 Employee object1 = new Employee();
		 Employee object2 = object1;
		 Employee object3 = object1;
		 
		 object1.setName("Rohit");
		 object2.setSalary(32);
		 
		 System.out.println("Name of the employee in first object is " + object1.getName());
		 System.out.println("Name of the employee in second object is " + object2.getName());
		 
		 System.out.println("salary of the employee in first object is " + object1.getSalary());
		 System.out.println("salary of the employee in second object is " + object2.getSalary());
		 
		 System.out.println("Name of the employee in first object is " + object3.getName());
		 System.out.println("salary of the employee in second object is " + object3.getSalary());
	 }
	
	
	
}




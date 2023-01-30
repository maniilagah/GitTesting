package oops_Programs.AbstractionPrograms;

public class CommonClassForVehicles {

	public static void main(String[] args) {
		
		Car car1 = new Car();
		Bike bike1 = new Bike();
		
		
		car1.funVehicleName();
		car1.start();
		
		bike1.funVehicleName();
		bike1.start();

	}

}

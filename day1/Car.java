package week1.day1;

public class Car {

	public void driveCar() {
	//code to print a text
		System.out.println("I am driving a car");
	}
	
	private void applyBreak() {
		System.out.println("Applied break");

	}
	
	public static void main(String[] args) {
		//create object to execute the methods
		Car myCar = new Car();
		myCar.driveCar();
		myCar.applyBreak();
	}
}

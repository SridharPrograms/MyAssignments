package week1.day1;

public class Twowheeler {
	//Global variables declaration outside of main method
	int noOfWheels=2;
	short noOfMirrors=2;
	long chassisNumber=85264445L;
	boolean isPunctured=false;
	String bikeName="Yamaha FZ-S";
	double runningKM=50000.50;
	
	public static void main(String[] args) {
	//Creating an object inside the main method to print global variables values
		Twowheeler myBike = new Twowheeler();
		System.out.println(myBike.noOfWheels);
		System.out.println(myBike.noOfMirrors);
		System.out.println(myBike.chassisNumber);
		System.out.println(myBike.isPunctured);
		System.out.println(myBike.bikeName);
		System.out.println(myBike.runningKM);
	}

}

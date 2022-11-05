package week1.day1;

public class Mobile {
	//Global variables declaration outside of main method
	String mobileBrandName="Apple Iphone";
	char mobileLogo='A';
	short noOfMobilePiece=1;
	int modelNumber=13;
	long mobileImeiNumber=123456789123456L;
	float mobilePrice=35000.60f;
	boolean isDamaged=false;
	
	public static void main(String[] args) {
	//Creating an object inside the main method to print global variables values
		Mobile myMob=new Mobile();
		System.out.println(myMob.mobileBrandName);
		System.out.println(myMob.mobileLogo);
		System.out.println(myMob.noOfMobilePiece);
		System.out.println(myMob.modelNumber);
		System.out.println(myMob.mobileImeiNumber);
		System.out.println(myMob.mobilePrice);
		System.out.println(myMob.isDamaged);
	}

}

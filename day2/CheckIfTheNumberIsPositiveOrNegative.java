package week1.day2;

public class CheckIfTheNumberIsPositiveOrNegative {

	public static void main(String[] args) {
		int number=0;
		if (number>0) {
			System.out.println("The number:" + number + " is positive");
		}
		else if (number<0) {
			System.out.println("The number:" + number + " is negative");
		}
		else
			System.out.println("The number:" + number + " is neither positive or negative");
	}
}

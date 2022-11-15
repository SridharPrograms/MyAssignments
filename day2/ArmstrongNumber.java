package week1.day2;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int input=371;
		int calculated=0, remainder, original,quotient;
		original=input;
		while (original>0) {
			remainder=original%10;
			quotient=original/10;
			calculated=calculated+(remainder*remainder*remainder);
			original=quotient;
			System.out.println("cal = "+calculated);
			}
		if (calculated == input) {
			System.out.println("The given number "+input+ " is an Armstrong number");
		}
		else
			System.out.println("The given number "+input+ "  is not an Armstrong number");
	}

}

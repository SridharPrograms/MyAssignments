package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		int input=7;
		int count=0;
		//start the division from 1 and stop at 7
		for (int i=1;i<=input;i++) {
			if (input%i == 0) {
				count++;
				System.out.println(count);
			}
		}
		if (count==2) {
			System.out.println("The given number is a prime");
		}
			else {
			System.out.println("The given number is not a prime");
			}
		}
		
		
	}

package week1.day2;

public class Factorial {

	public static void main(String[] args) {
	int input=4;
	int fact=1;
	for (int i=1;i<=input;i++) {
		fact=fact*i;
	}
	System.out.println("Factorial value is:" + fact);
	}
}

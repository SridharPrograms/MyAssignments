package week2.day2;

public class Palindrome {

	public static void main(String[] args) {
	//Declare string variables
	String str = "madam";
	String rev = "";
	
	//Iterate the loop to store the char in reverse order
	for (int i=str.length()-1;i>=0;i--) {
		rev=rev + str.charAt(i);
	}
	
	//Compare the original string and reversed string
		if (str.equals(rev)) {
			System.out.println("The given string " + rev + " is a palindrome");
		}
		else {
			System.out.println("The given string " + rev + " is not a palindrome");
		}
	}
	}

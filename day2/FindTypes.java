package week2.day2;

public class FindTypes {

	public static void main(String[] args) {
		// Here is the input
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		
		// Here is what the count you need to find
		int  letter = 0, space = 0, num = 0, specialChar = 0;
		
		//Convert the String to character array
		char[] charArray = test.toCharArray();
		
		//Traverse through each character (using loop)
		for (int i=0;i<charArray.length;i++) {
			if (Character.isLetter(charArray[i]) == true) {
				letter = letter+1;
			}
			else if (Character.isDigit(charArray[i]) == true) {
				num=num+1;
			}
			else if (Character.isSpaceChar(charArray[i]) == true) {
				space=space+1;
			}
			else {
				specialChar=specialChar+1;
			}	
			}
			// Print the count here
			System.out.println("letter: " + letter);
			System.out.println("space: " + space);
			System.out.println("number: " + num);
			System.out.println("specialCharcter: " + specialChar);
		}
	}

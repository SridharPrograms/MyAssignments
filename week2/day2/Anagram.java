package week2.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		//Declaration of strings
		String text1 = "stops";
		String text2 = "potss"; 
		
		//Compare the length of two strings
		if (text1.length()==text2.length()){
		//Convert both Strings in to characters	
			char[] textchar1 = text1.toCharArray();
			char[] textchar2 = text2.toCharArray();
			Arrays.sort(textchar1);
			Arrays.sort(textchar2);
			boolean result = Arrays.equals(textchar1, textchar2);
			if (result == true) {
				System.out.println("The given strings is an Anagram");
			}
			else {
				System.out.println("The given strings are not an Anagram");
			}
		}
		else {
			System.out.println("The given strings are not matching");
		}
	}

}

package week2.day2;

public class PhrasePalindrome {

	public static void main(String[] args) {
		String str1 = "A man, a plan, a canal: Panama";
		String rev1 = "";
		str1 = str1.replaceAll("[^a-zA-Z0-9]", "");
		for (int i=str1.length()-1;i>=0;i--) {
			rev1=rev1 + str1.charAt(i);
		}
			if (str1.equalsIgnoreCase(rev1)) {
				System.out.println("The given phrase " + rev1 + " is a palindrome");
			}
			else {
				System.out.println("The given phrase " + rev1 + " is not a palindrome");
			}
		
		String str2 = "race a car";
		String rev2 = "";
		str2 = str2.replaceAll("[^a-zA-Z0-9]", "");
		for (int i=str2.length()-1;i>=0;i--) {
			rev2=rev2 + str2.charAt(i);
		}
			if (str2.equalsIgnoreCase(rev2)) {
				System.out.println("The given phrase " + rev2 + " is a palindrome");
			}
			else {
				System.out.println("The given phrase " + rev2 + " is not a palindrome");
			}	
			
		String str3 = "";
		String rev3 = "";
		str3 = str3.replaceAll("[^a-zA-Z0-9]", "");
		for (int i=str3.length()-1;i>=0;i--) {
			rev3=rev3 + str3.charAt(i);
		}
			if (str3.equalsIgnoreCase(rev3)) {
				System.out.println("The given phrase " + rev3 + " is a palindrome");
			}
			else {
				System.out.println("The given phrase " + rev3 + " is not a palindrome");
			}	
	}

}

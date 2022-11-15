package week2.day2;

public class CharOccurance {

	public static void main(String[] args) {
		String str = "welcome to chennai";
		int count =0;
		// convert the string into char array
		char[] charArray = str.toCharArray();
		//get the length of the array
		int len=charArray.length;
		// traverse from 0 till the array length 
		for (int i=0;i<len;i++) {
			// Check the char array has the particular char in it 
			if (charArray[i]=='t') {
				// if is has increment the count
				count=count+1;
			}
			else {
				continue;
			}
		}
		System.out.println("Number of occurencess of letter e is:" + count);

	}

}

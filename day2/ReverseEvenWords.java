package week2.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String test = "I am a software tester"; 
		//split the words and have it in an array
		String[] spl = test.split(" ");
		//Traverse through each word (using loop)
		for (int i=0;i<spl.length;i++) {
		//find the odd index within the loop (use mod operator)	
			if((i % 2) != 0)  {
			//split the words and have it in an array	
			String[] spl1 = spl[i].split(" ");
			System.out.println(spl1[i]);
			}
		}

	}

}

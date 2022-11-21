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
				char[] charArray = spl[i].toCharArray();
			//print the even position words in reverse order using another loop (nested loop)
				for (int j = charArray.length -1; j>=0;j--) {
					System.out.print(charArray[j]);
				}
			}
			else {
				System.out.print(" ");
				//Convert words to character array if the position is even else print the word as it is(concatenate space at the end)
				System.out.print(spl[i]+" ");
			}
			}
		}

	}


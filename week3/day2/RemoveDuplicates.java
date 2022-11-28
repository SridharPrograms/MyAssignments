package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String str ="google";
		System.out.println(str.length());
		char[] textchar1 = str.toCharArray();
		
		Set<Character> uniquechar = new HashSet<Character>();

		for (int i=0;i<textchar1.length;i++) {
			uniquechar.add(textchar1[i]);

			}
	System.out.println(uniquechar);
		
	}

}

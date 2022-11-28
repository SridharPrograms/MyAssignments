package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		String str ="sridharrajan";
		System.out.println("Given String length is:" + str.length());
		System.out.println(str);
		char[] textchar = str.toCharArray();
		Set<Character> uniquechar = new HashSet<Character>();
		for (int i=0;i<textchar.length;i++) {
			uniquechar.add(textchar[i]);
			}
	System.out.println("Unique Character String length is:" + uniquechar.size());
	System.out.println(uniquechar);
	}
}

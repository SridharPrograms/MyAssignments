package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesUsingSet {

	public static void main(String[] args) {
		String str="PayPal India"; 
		char[] textchar = str.toCharArray();
		Set<Character> charSet  = new HashSet<Character>();
		Set<Character> dupCharSet  = new HashSet<Character>();
		for (Character element : textchar) {
			if (!charSet.add(element)) {
				dupCharSet.add(element);
			}
			else {
				charSet.add(element);
			}
		
		}
        System.out.println(charSet);
        System.out.println(dupCharSet);
        for (Character b : dupCharSet) {
          	 charSet.remove(b);
           }
        System.out.println(charSet);
        
        for (Character ele : charSet) {
        if (ele.equals(' ')) {
        	charSet.remove(ele);
        	break;
        }
        }
        
        System.out.println(charSet);
	}

}

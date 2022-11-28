package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesWords {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		String[] spl = text.split(" ");
		Set<String> uniquestr = new LinkedHashSet<String>();
		for(int i=0;i<spl.length;i++) {
			uniquestr.add(spl[i]);
		}
		System.out.println(uniquestr);
	}

}

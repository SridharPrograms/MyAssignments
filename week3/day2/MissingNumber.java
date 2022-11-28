package week3.day2;

import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
		int [] mis = {3,5,1,4,2,6,10,9,8};
		Set<Integer> misnum = new TreeSet<Integer>();
		for (int i=0;i<mis.length;i++) {
			misnum.add(mis[i]);
			}
		System.out.println(misnum);
		for (int j=1;j<misnum.size()+1;j++) {
			if(!misnum.contains(j)) {
				System.out.println(j);
		}
		}	

	}

}

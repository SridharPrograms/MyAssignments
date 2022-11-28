package week3.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		Set<Integer> trint = new TreeSet<Integer>();
		for (int i=0;i<data.length;i++) {
			trint.add(data[i]);
		}
		System.out.println("Numbers after added to TreeSet:" + trint);
		List<Integer> lsint=new ArrayList<Integer>();
		lsint.addAll(trint);
		System.out.println("Numbers after added to ListSet:" +lsint);
		int lstSize = lsint.size();
		System.out.println("The second Largest number in the ListSet is:" + lsint.get(lstSize-2));
				}

}

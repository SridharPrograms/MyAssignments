package week1.day2;

import java.util.Arrays;

public class LearnArray {

	public static void main(String[] args) {
		//array declaration
		int[] values = new int[3];
		values[0]=20;
		values[1]=10;
		values[2]=30;
		
		int noOfData = values.length; //no.of data in a array
//		System.out.println(values[0]);
//		System.out.println(noOfData);
		
		//To sort the data in ascending order
		Arrays.sort(values);
		for (int i=0;i<noOfData;i++) {
			System.out.println(values[i]);
		}
		//Print in reverse
		for (int i=noOfData-1;i>=0;i--) {
			System.out.println(values[i]);
		}
	}

}

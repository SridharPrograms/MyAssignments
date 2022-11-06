package week1.day2;

public class PrintDuplicatesFromArray {

	public static void main(String[] args) {
		int array[] = {14,12,13,11,15,14,18,17,18,19,17,20,14};
		for (int i=0;i<array.length;i++) {
			
			for (int j=i+1;j<array.length;j++) {
				
				if (array[i] == array[j]) {
					System.out.println(array[i]);
				}
			}
		}

	}

}

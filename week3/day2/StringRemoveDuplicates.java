package week3.day2;

public class StringRemoveDuplicates {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";	
		String[] spl = text.split(" ");
		String updText="";
		int count;
		for (int i=0; i<spl.length;i++) {
			count=0;
			for (int j=0;j<spl.length;j++) {
				if(spl[i].equals(spl[j])) {
					count++;
					if (count>1) {
						spl[j].replace(spl[j]," ");
						break;
					}
					if(i==j) {
						updText=updText+spl[j];
					}
					}
				
			}
			
		}
		System.out.println(updText);

	}

}

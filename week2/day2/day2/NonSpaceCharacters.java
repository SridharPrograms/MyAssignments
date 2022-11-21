package week2.day2;

public class NonSpaceCharacters {

	public static void main(String[] args) {
		 String s1="Hello World";
		 String s2="   fly me   to   the moon  ";
		 String s3="luffy is still joyboy";
		 String[] str1 = s1.split(" ");
		 String[] str2 = s2.split(" ");
		 String[] str3 = s3.split(" ");
		 System.out.println("Length of last word in s1: "+str1[(str1.length)-1].length());
		 System.out.println("Length of last word in s2: "+str2[(str2.length)-1].length());
		 System.out.println("Length of last word in s3: "+str3[(str3.length)-1].length());
		}

}

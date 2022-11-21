package week3.day1.org.system;

public class Desktop extends Computer {

	public void desktopSize() {
		System.out.println("Computer Size is 15 inch");
	}
	public static void main(String[] args) {
		Desktop d=new Desktop();
		d.computerModel();
		d.desktopSize();

	}

}

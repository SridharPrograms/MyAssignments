package week3.day1.Abstraction;

public class Automation extends MultipleLangauge implements Language,TestTool  {

	public static void main(String[] args) {
		Automation at = new Automation();
		at.Selenium();
		at.Java();
		at.python();
		at.ruby();
	}

	public void Selenium() {
		System.out.println("Implemented Method in Automation Class from TestTool Interface");
	}
	public void Java() {
		System.out.println("Implemented Method in Automation Class from Language Interface");
	}
	public void ruby() {
		System.out.println("Implemented Method in Automation Class from Abstract class");
	}
}

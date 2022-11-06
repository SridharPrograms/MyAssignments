package week1.day2;

public class MyCalculator {
// shortcut to create a local variable - Ctrl+2 then L

	
	public static void main(String[] args) {
	Calculator cal=new Calculator();
	int add=cal.sum(20, 30, 40);
	System.out.println("The sum of 3 values:" + add);
	int sub=cal.sub(50,20);
	System.out.println("The sub of 2 values:" + sub);
	double mul=cal.mul(45.5,25.5);
	System.out.println("The prodct of 2 values:" + mul);
	float div=cal.div(60.25f,20.1f);
	System.out.println("The div of 2 values:" +div);
	}

}

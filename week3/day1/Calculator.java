package week3.day1;

public class Calculator {

	public void add (int a, int b) {
		System.out.println("The integer sum of a & b:"+ (a+b));
		}
	public void add (int a, int b, int c) {
		System.out.println("The integer sum of a,b & c:"+ (a+b+c));
		}
	public void sub (double a, double b) {
		System.out.println("The double sub of a & b:"+ (a-b));
		}
	public void sub (int a, int b) {
		System.out.println("The integer sub of a & b:"+ (a-b));
		}
	public void mul (int a, double b) {
		System.out.println("The integer a, double b - mul of a & b:"+ (a*b));
		}
	public void mul (double a,double b) {
		System.out.println("The double sub of a & b:"+ (a*b));
		}
	
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.add(2,3);
		cal.add(2,3,4);
		cal.sub(3,2);
		cal.sub(25.5,23.3);
		cal.mul(25,12.5);
		cal.mul(2.5,6.8);
	}

}

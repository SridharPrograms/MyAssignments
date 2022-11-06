package week1.day2;

public class LearnInputAndOutput {

public double sum (int num1, int num2, double num3) {
	double result=num1+num2+num3;

	//give output
	return result;
	}
	
	public static void main(String[] args) {
		LearnInputAndOutput liao = new LearnInputAndOutput();
		double res=liao.sum(20,40,60.46);
		System.out.println(res);
	}
}

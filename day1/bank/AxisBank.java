package week3.day1.bank;

public class AxisBank extends BankInfo{
	public void deposit() {
		System.out.println("AxisBank Class:Deposit");

	}
	public static void main(String[] args) {
		AxisBank ab=new AxisBank();
		ab.saving();
		ab.fixed();
		ab.deposit();
	}

}

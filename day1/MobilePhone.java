package week1.day1;

public class MobilePhone {
public void makeCall() {
	System.out.println("Call Made");
}
	public void sendMsg() {
	System.out.println("Message Sent");
	}
	
	public static void main(String[] args) {
		MobilePhone myMob = new MobilePhone();
		myMob.makeCall();
		myMob.sendMsg();
	}

}

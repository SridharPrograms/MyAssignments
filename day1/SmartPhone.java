package week3.day1;

public class SmartPhone extends AndroidPhone{
	public void connectWhatsApp() {
		 System.out.println("WhatsApp Connected");
	}
	public void takeVideo() {
		 System.out.println("Video Taken executed from SmartPhone class");
	}
	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone();
		sp.sendMsg();
		sp.makeCall();
		sp.saveContact();
		sp.takeVideo();
		sp.connectWhatsApp();
		
	}

}

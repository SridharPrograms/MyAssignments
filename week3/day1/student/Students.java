package week3.day1.student;

public class Students {
	private void getStudentInfo(int id) {
		System.out.println("Student ID is: "+id);
	}
	private void getStudentInfo(int id, String name) {
		System.out.println("Student ID is: "+id +" and Student Name is: "+name);
	}
	private void getStudentInfo(String email, String phoneNumber) {
		System.out.println("Student Email is: "+email +" and Student PhoneNumber is: "+phoneNumber);
	}
	
	
	public static void main(String[] args) {
		Students stu=new Students();
		stu.getStudentInfo(5);
		stu.getStudentInfo(2,"Sridhar");
		stu.getStudentInfo("sa2@gmail.com","9894933045");
	}

}

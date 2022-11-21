package week3.day1.org.student;

import week3.day1.org.department.Department;

public class Student extends Department{

	public void student() {
		System.out.println("Child Class:Student Name is Sri");
	}
	public static void main(String[] args) {
		Student s = new Student();
		s.collegeName();
		s.collegeCode();
		s.collegeRank();
		s.deptName();
		s.student();
	}

}

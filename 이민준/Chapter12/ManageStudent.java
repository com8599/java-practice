package 이민준.Chapter12;

import 이민준.Chapter08.practice.Student;

public class ManageStudent {
	public static void main(String[] args) {
		ManageStudent manageStudent = new ManageStudent();
		manageStudent.checkEquals();
	}

	public 이민준.Chapter08.practice.Student[] addStudent() {
		이민준.Chapter08.practice.Student[] student = new 이민준.Chapter08.practice.Student[3];
		student[0] = new 이민준.Chapter08.practice.Student("lim");
		student[1] = new 이민준.Chapter08.practice.Student("min");
		student[2] = new 이민준.Chapter08.practice.Student("test", "test", "test", "test");
		return student;
	}

	public void printStudents(이민준.Chapter08.practice.Student[] students) {
		for (Student student : students ) {
			System.out.println(student);
		}
	}

	public void checkEquals() {
		Student a = new Student("Min", "S", "010XXXXXXXX", "test.com");
		Student b = new Student("Min", "S", "010XXXXXXXX", "test.com");
		if (a.equals(b)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}

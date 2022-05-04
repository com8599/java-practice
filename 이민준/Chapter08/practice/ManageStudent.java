package 이민준.Chapter08.practice;

public class ManageStudent {
	public static void main(String[] args) {
		ManageStudent manageStudent = new ManageStudent();
		Student[] students = null;
		students = manageStudent.addStudent();
		manageStudent.printStudents(students);
	}

	public Student[] addStudent() {
		Student[] student = new Student[3];
		student[0] = new Student("lim");
		student[1] = new Student("min");
		student[2] = new Student("test", "test", "test", "test");
		return student;
	}

	public void printStudents(Student[] students) {
		for (Student student : students ) {
			System.out.println(student);
		}
	}
}

package 이민준.Chapter08.practice;

public class Student {
	public static void main(String[] args) {
		Student student = new Student("minjoon", "서울", "010", "naver.com");
		System.out.println(student);
	}
	private String name;
	private String address;
	private String phone;
	private String email;

	public Student(String name) {
		this.name = name;
	}

	public Student(String name, String address, String phone, String email) {
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Student{" +
			"name='" + name + '\'' +
			", address='" + address + '\'' +
			", phone='" + phone + '\'' +
			", email='" + email + '\'' +
			'}';
	}
}

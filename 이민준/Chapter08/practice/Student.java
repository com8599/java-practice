package 이민준.Chapter08.practice;

import java.util.Objects;

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
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Student student = (Student)o;
		return Objects.equals(name, student.name) && Objects.equals(address, student.address)
			&& Objects.equals(phone, student.phone) && Objects.equals(email, student.email);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, address, phone, email);
	}
}

package 이민준.Chapter10;

public class Parent {
	private String name;

	public Parent() {
	}

	public Parent(String name) {
		this.name = name;
		System.out.println("Parent Constructor");
	}

	public void printName() {
		System.out.println("Parent");
	}
}

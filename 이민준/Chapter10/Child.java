package 이민준.Chapter10;

public class Child extends Parent {
	public Child() {
		super("name");
		System.out.println("Child Constructor");
	}

	public Child(String name) {
	}

	public void printName() {
		System.out.println("Child");
	}
}

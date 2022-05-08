package 이민준.Chapter10;

public class InheritanceCasting {
	public static void main(String[] args) {
		InheritanceCasting inheritanceCasting = new InheritanceCasting();
		inheritanceCasting.objectCast();
	}

	private void objectCast() {
		Parent parent = new Parent();
		Child child = new Child();

		Parent parent2 = child;
		Child child2 = (Child) parent;
	}
}

package 이민준.Chapter10;

public class InheritanceCasting {
	public static void main(String[] args) {
		InheritanceCasting inheritanceCasting = new InheritanceCasting();
		inheritanceCasting.objectCastArray();
	}

	public void objectCastArray() {
		Parent[] parentArrays = new Parent[3];
		parentArrays[0] = new Child();
		parentArrays[1] = new Parent();
		parentArrays[2] = new Child();

		for (Parent parent : parentArrays) {
			if (parent instanceof Child) {
				parent.printName();
			} else {
				parent.printName();
			}
		}
	}
	private void objectCast() {
		Child child = new Child();
		Parent parent = child;
		Child child2 = (Child) parent;
	}
}

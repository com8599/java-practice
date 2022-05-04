package 이민준.Chapter08;

public class MethodVarargs {
	public static void main(String[] args) {
		MethodVarargs varargs = new MethodVarargs();
		varargs.calculateNumbersWithArray(new int[] {1, 2, 3, 4, 5});
		varargs.calculateNumbers(1,2,3,4,5);
	}
	public void calculateNumbersWithArray(int[] ints) {
	}
	private void calculateNumbers(int... numbers) {
	}
}

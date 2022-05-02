package Chapter08.test;

public class MethodVarargs {
    public static void main(String[] args) {
        MethodVarargs varargs = new MethodVarargs();
        varargs.calculateNumbersWithArray(new int[]{1,2,3,4,5});
        varargs.calculateNumbers(1,2,3,4,5);
    }

    private void calculateNumbersWithArray(int[] numbers) {
    }

    private void calculateNumbers(int...numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        System.out.println("Total=" + total);
    }
}

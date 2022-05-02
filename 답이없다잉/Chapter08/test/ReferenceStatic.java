package Chapter08.test;

public class ReferenceStatic {
    public static String name = "Min";

    public static void main(String[] args) {
        ReferenceStatic.staticMethod();
    }

    private static void staticMethod() {
        System.out.println("This is a staticMethod!");
    }

    public static void staticMethodCallVariable() {
        System.out.println(name);
    }
}

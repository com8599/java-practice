package Chapter08;

public class ReferenceReturn {
    public static void main(String[] args) {
        ReferenceReturn referenceReturn = new ReferenceReturn();
        System.out.println(referenceReturn.intReturn());
        System.out.println(referenceReturn.intArrayReturn());
        System.out.println(referenceReturn.StringReturn());
    }

    private int intReturn() {
        return 0;
    }

    private int[] intArrayReturn() {
        return new int[10];
    }

    private String StringReturn() {
        return "Return value";
    }
}

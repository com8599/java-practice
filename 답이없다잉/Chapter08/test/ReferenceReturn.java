package Chapter08.test;

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

    // java: unreachable statement
//    private int calculateAfterIntReturn() {
//        int returnInt = 0;
//        return returnInt;
//        returnInt++;
//    }

    public int ifConditionIntReturn() {
        int returnInt = 0;
        if (returnInt == 0) {
            return ++returnInt;
        } else {
            return --returnInt;
        }
    }
    public int ifConditionNoElseIntReturn() {
        int returnInt = 0;
        if (returnInt == 0) {
            return ++returnInt;
        }
        return --returnInt;
    }
}

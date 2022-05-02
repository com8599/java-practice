package Chapter09.test;

import static Chapter09.test.SubStatic.CLASS_NAME;
import static Chapter09.test.SubStatic.subStaticMethod;

public class PackageStatic {
    public static void main(String[] args) {
//        SubStatic.subStaticMethod();
//        System.out.println(SubStatic.CLASS_NAME);
        subStaticMethod();
        System.out.println(CLASS_NAME);
    }
}

package Chapter09.test;

public class AccessCall {
    public static void main(String[] args) {
        AccessModifier accessModifier = new AccessModifier();
        accessModifier.publicMethod();
        accessModifier.protectedMethod();
        accessModifier.packagePrivateMethod();
        // accessModifier.privateMethod();
    }
}

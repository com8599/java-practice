package Chapter08.test;

public class ReferenceStaticVariable {
    String name;

    public ReferenceStaticVariable() {
    }

    public ReferenceStaticVariable(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        ReferenceStaticVariable referenceStaticVariable = new ReferenceStaticVariable();
        referenceStaticVariable.checkName();
    }

    private void checkName() {
        ReferenceStaticVariable referenceStaticVariable = new ReferenceStaticVariable("TulipLee");
        System.out.println(referenceStaticVariable.name);
        ReferenceStaticVariable referenceStaticVariable2 = new ReferenceStaticVariable("TwoLee");
        System.out.println(referenceStaticVariable.name);
    }
}

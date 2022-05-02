package Chapter08;

public class ReferenceString {
    String instanceVariable;

    public ReferenceString(String str) {
    }

    public ReferenceString() {
    }

    public static void main(String[] args) {
        ReferenceString referenceString = new ReferenceString();
    }

    public String getInstanceVariable() {
        return instanceVariable;
    }

    public void setInstanceVariable(String str) {
        instanceVariable = str;
    }
}

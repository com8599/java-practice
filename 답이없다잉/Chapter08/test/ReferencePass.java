package Chapter08.test;

public class ReferencePass {
    public static void main(String[] args) {
        ReferencePass referencePass = new ReferencePass();
        referencePass.callPassByValue();
        referencePass.callPassByReference();
    }

    private void callPassByValue() {
        int a = 10;
        String b = "b";
        System.out.println("before passByValue");
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        passByValue(a, b);
        System.out.println("after passByValue");
        System.out.println("a=" + a);
        System.out.println("b=" + b);
    }

    private void passByValue(int a, String b) {
        a = 20;
        b = "z";
        System.out.println("in passByValue");
        System.out.println("a=" + a);
        System.out.println("b=" + b);
    }

    private void callPassByReference() {
        MemberDTO memberDTO = new MemberDTO("TulipLee");
        System.out.println("before passByReference");
        System.out.println("member.name=" + memberDTO.name);
        passByReference(memberDTO);
        System.out.println("after passByReference");
        System.out.println("member.name=" + memberDTO.name);
    }

    private void passByReference(MemberDTO memberDTO) {
        memberDTO.name = "TwoLee";
        System.out.println("in passByReference");
        System.out.println("member.name=" + memberDTO.name);
    }
}

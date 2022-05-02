package Chapter08.test;

public class ReferenceConstructor {
    public static void main(String[] args) {
        ReferenceConstructor referenceConstructor = new ReferenceConstructor();
        referenceConstructor.makeMemberObject();
    }

    private void makeMemberObject() {
        MemberDTO dto1 = new MemberDTO();
        MemberDTO dto2 = new MemberDTO("TulipLee");
        MemberDTO dto3 = new MemberDTO("TulipLee", "010xxxxxxxx");
        MemberDTO dto4 = new MemberDTO("TulipLee", "010xxxxxxxx", "com8599@gmail.com");
    }
}

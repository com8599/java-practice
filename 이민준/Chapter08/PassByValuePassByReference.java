package 이민준.Chapter08;

import Chapter08.test.MemberDTO;

public class PassByValuePassByReference {
	public static void main(String[] args) {
		PassByValuePassByReference reference = new PassByValuePassByReference();
		// reference.callPassByValue();
		reference.callPassByReference();
	}

	public void callPassByValue() {
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

	public void callPassByReference(){
		MemberDTO memberDTO = new MemberDTO("Sangmin");
		System.out.println("before passByReference");
		System.out.println("member.name=" + memberDTO.name);
		passByReference(memberDTO);
		System.out.println("afeter passByReference");
		System.out.println("member.name" + memberDTO.name);
	}

	private void passByReference(MemberDTO memberDTO) {
		memberDTO.name = "SungChoon";
		System.out.println("in passByReference");
		System.out.println("member.name="+memberDTO.name);
	}
}


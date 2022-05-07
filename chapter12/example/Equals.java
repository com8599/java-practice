package com.example.godofjava.chapter12.example;

public class Equals {
    public static void main(String[] args) {
        MemberDTO memberDTO1 = new MemberDTO("홍길동", "s_cova_0418@naver.com");
        MemberDTO memberDTO2 = new MemberDTO("홍길동", "s_cova_0418@naver.com");

        if (memberDTO1.equals(memberDTO2)) {
            System.out.println("this is same");
        } else {
            System.out.println("this is different");
        }
    }
}

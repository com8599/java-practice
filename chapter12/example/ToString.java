package com.example.godofjava.chapter12.example;

public class ToString {
    public static void main(String[] args) {
        ToString toString = new ToString();
        toString.toStringMethod(toString);
    }

    public void toStringMethod(Object obj) {
        System.out.println(obj);
        System.out.println(obj.toString());
        System.out.println("plus " + obj);
    }
}

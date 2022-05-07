package com.example.godofjava.chapter12.solution;

public class Student {

    private String name;
    private String address;
    private String phone;
    private String email;

    public Student(String name, String address, String phone, String email) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == null) return false;
        if (this == obj) return true;
        if (getClass() != obj.getClass()) return false;

        Student other = (Student) obj;

        if (name == null) {
            if (other.name != null) return false;
        } else if (!name.equals(other.name)) return false;

        if (address == null) {
            if (other.address != null) return false;
        } else if (!address.equals(other.address)) return false;

        if (phone == null) {
            if (other.phone != null) return false;
        } else if (!phone.equals(other.phone)) return false;

        if (email == null) {
            if (other.email != null) return false;
        } else if (!email.equals(other.email)) return false;

        return true;
    }
}

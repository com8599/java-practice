// Student Class
class Student {
    private String name;
    private String address;
    private String phone;
    private String email;

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, String address, String phone, String email) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

// ManageStudent Class
class ManageStudent {
    public static void main(String[] args) {
        ManageStudent manageStudent = new ManageStudent();
        Student[] students;

        students = manageStudent.addStudent();
        manageStudent.printStudents(students);
    }

    public Student[] addStudent() {
        Student[] students = new Student[3];
        students[0] = new Student("Lim");
        students[1] = new Student("Min");
        students[2] = new Student("Sook", "Seoul", "010xxxxxxxx", "example@naver.com");

        return students;
    }

    public void printStudents (Student... students) {
        for(Student student : students) {
            System.out.println(student.toString());
        }
    }
}

package Chapter08.practice;

public class ManageStudent {
    public static void main(String[] args) {
        Student[] student = addStudent();
        printStudents(student);
    }

    public static Student[] addStudent() {
        Student[] student = new Student[3];
        student[0] = new Student("Lee");
        student[1] = new Student("Tulip");
        student[2] = new Student("Lee", "Seoul", "010xxxxxxxx", "com8599@gmail.com");
        return student;
    }

    public static void printStudents(Student[] students) {
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }
}

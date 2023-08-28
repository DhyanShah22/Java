class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class School {
    public void admitStudent(Student student) {
        System.out.println("Student admitted:");
        student.displayDetails();
    }
}

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Dhyan", 19);
        Student student2 = new Student("Madhav", 19);

        School school = new School();

        school.admitStudent(student1);
        System.out.println();

        school.admitStudent(student2);
    }
}
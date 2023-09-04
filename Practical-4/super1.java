class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    void introduceYourself() {
        System.out.println("Hello, I am " + name);
    }
}

class Student extends Person {
    String studentId;

    Student(String name, String studentId) {
        super(name); // Calling the constructor of the superclass (Person)
        this.studentId = studentId;
    }

    @Override
    void introduceYourself() {
        super.introduceYourself(); // Calling the introduceYourself() method of the superclass (Person)
        System.out.println("I am a student with ID " + studentId);
    }
}

public class super1 {
    public static void main(String[] args) {
        Student student = new Student("Dhyan", "269");
        student.introduceYourself();
    }
}

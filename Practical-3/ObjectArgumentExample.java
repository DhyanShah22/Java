class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class ObjectArgumentExample {

    public static void main(String[] args) {
        Person person = new Person("Dhyan", 19);
        displayPersonInfo(person);
    }

    public static void displayPersonInfo(Person p) {
        System.out.println("Displaying person information:");
        p.display();
    }
}
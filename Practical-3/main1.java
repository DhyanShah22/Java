import java.util.Scanner;

class Employee {
    String name;
    int age;
    double salary;

    void inputDetails() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter employee name: ");
        name = scanner.nextLine();
        
        System.out.print("Enter employee age: ");
        age = scanner.nextInt();
        
        System.out.print("Enter employee salary: ");
        salary = scanner.nextDouble();
    }

    void displayDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}

public class main1 {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.inputDetails();
        System.out.println();
        employee.displayDetails();
    }
}
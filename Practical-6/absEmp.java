abstract class Employee {
    private String name;
    private int employeeId;
    
    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }
    public abstract double calculateSalary();

    public abstract void displayInfo();

    public String getName() {
        return name;
    }
        public int getEmployeeId() {
        return employeeId;
    }
}
class Manager extends Employee {
    private double baseSalary;
    
    public Manager(String name, int employeeId, double baseSalary) {
        super(name, employeeId);
        this.baseSalary = baseSalary;
    }
    public double calculateSalary() {
        // For simplicity, we assume a fixed bonus for managers
        double bonus = 1000.0;
        return baseSalary + bonus;
    }
    public void displayInfo() {
        System.out.println("Manager Details:");
        System.out.println("Name: " + getName());
        System.out.println("Employee ID: " + getEmployeeId());
        System.out.println("Salary: $" + calculateSalary());
    }
}
class Programmer extends Employee {
    private double hourlyRate;
    private int hoursWorked;
    
    public Programmer(String name, int employeeId, double hourlyRate, int hoursWorked) {
        super(name, employeeId);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
    public void displayInfo() {
        System.out.println("Programmer Details:");
        System.out.println("Name: " + getName());
        System.out.println("Employee ID: " + getEmployeeId());
        System.out.println("Salary: $" + calculateSalary());
    }
}
public class absEmp {
    public static void main(String[] args) {
        Manager manager = new Manager("John Smith", 101, 5000.0);
        Programmer programmer = new Programmer("Alice Johnson", 102, 30.0, 160);

        manager.displayInfo();
        programmer.displayInfo();
    }
}

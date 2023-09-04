class Parent {
    final void display() {
        System.out.println("This is a final method in the Parent class.");
    }
}

class Child extends Parent {
    // Attempting to override the final method will result in a compilation error
    // void display() {
    //     System.out.println("This is an overridden method in the Child class.");
    // }
}

public class final1 {
    public static void main(String[] args) {
        Parent parent = new Child();
        parent.display();
    }
}

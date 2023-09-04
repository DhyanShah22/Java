class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Mammal extends Animal {
    void breathe() {
        System.out.println("Mammal breathes");
    }
}

class Dog extends Mammal {
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Mammal {
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        // Single Inheritance
        Dog myDog = new Dog();
        myDog.sound(); // Calls Dog class method
        myDog.breathe(); // Calls Mammal class method

        // Multilevel Inheritance
        Cat myCat = new Cat();
        myCat.sound(); // Calls Cat class method
        myCat.breathe(); // Calls Mammal class method

        // Hierarchical Inheritance
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        animal1.sound(); // Calls Dog class method
        animal2.sound(); // Calls Cat class method
    }
}

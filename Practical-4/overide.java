class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

public class overide {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myAnimal.makeSound(); // Calls the makeSound() method of the Animal class
        myDog.makeSound();    // Calls the makeSound() method of the Dog class
        myCat.makeSound();    // Calls the makeSound() method of the Cat class
    }
}

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Mammal extends Animal {
    void sound() {
        System.out.println("Mammal makes a sound");
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

public class Cat1 {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myMammal = new Mammal();
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myAnimal.sound(); // Calls the sound() method of the Animal class
        myMammal.sound(); // Calls the sound() method of the Mammal class
        myDog.sound();    // Calls the sound() method of the Dog class
        myCat.sound();    // Calls the sound() method of the Cat class
    }
}

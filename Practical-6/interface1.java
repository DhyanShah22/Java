interface Shape {
    void draw();
}

interface Color {
    void fill();
}

class Circle implements Shape, Color {
    public void draw() {
        System.out.println("Drawing a Circle");
    }
    public void fill() {
        System.out.println("Filling the Circle with color");
    }
}

public class interface1 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.draw();
        circle.fill();
    }
}

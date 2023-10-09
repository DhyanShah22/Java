class OverloadingDemo 
{
public OverloadingDemo(){
System.out.println("Default constructor");
}
public OverloadingDemo(int value){
System.out.println("Constructor with int parameter: " + value);
}
public OverloadingDemo(double value) {
System.out.println("Constructor with double parameter: " + value);
}
public void printValue(int value) {
System.out.println("Method with int parameter: " + value);
}
public void printValue(double value) {
System.out.println("Method with double parameter: " + value);
}
public void printValue(String value) {
System.out.println("Method with String parameter: " + value);
}
}
public class Main45
{
public static void main(String[] args) {
OverloadingDemo obj1 = new OverloadingDemo(); 
OverloadingDemo obj2 = new OverloadingDemo(5);
OverloadingDemo obj3 = new OverloadingDemo(3.14);
obj1.printValue(10);
obj1.printValue(3.14);
obj1.printValue("Hello");
}
}
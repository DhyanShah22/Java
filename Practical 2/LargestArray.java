public class LargestArray {
    public static void main(String[] args) {
    int[] numbers = { 1,2,3,4,5,6,7,8,9,23,65 };
    int largest = numbers[0]; 
    for (int i = 1; i < numbers.length; i++) {
    if (numbers[i] > largest) {
    largest = numbers[i];
    }
    }
    System.out.println("The largest number in the array is: " + largest);
    }
   }
   
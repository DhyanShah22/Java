public class ArraytoArray {
    public static void main(String[] args) {
        int[] A1 = {1,2,3,4,5};
        int[] A2 = new int[A1.length];

        for(int i=0; i<A1.length; i++)
        {
            A2[i] = A1[i];
        }

        System.out.println("Contents of copied Array:");
        for (int num : A2) {
        System.out.print(num + " ");
        }
    }
}

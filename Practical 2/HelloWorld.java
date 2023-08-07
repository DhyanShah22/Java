import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.println("Input 1st NUMBER :");
        int A = sc.nextInt();
        System.out.println("Input 2ND NUMBER :");
        int B =sc.nextInt();
        System.out.println("INPUT BASE:");
        int base= sc.nextInt();
        int k=0;
        int i=0;
        int[] z = new int[20];
        //int z[3];
        while(A !=0 || B!=0){
            int x =A % 10;
            int y =B % 10;
            z[i] = (x+y+k) % base;
            i++;
            k = (x+y)/base ;
            A = A /10;
            B = B / 10;
            
            
        }
        System.out.println("Sum is = ");
        for(int j=i-1; j>=0; j--){
            System.out.print(z[j]);
        }
        
        
    }
}

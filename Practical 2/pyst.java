public class pyst {
        public static void main(String[] args) {
            String input = "stream";

            printpyst(input);
        }
    
        public static void printpyst (String str) {
            int n = str.length();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    System.out.print(" ");
                }
    
                for (int j = 0; j <= i; j++) {
                    System.out.print(str.charAt(j) + " ");
                }
                System.out.println();
              }  }}                   
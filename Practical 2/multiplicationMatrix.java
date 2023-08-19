public class multiplicationMatrix{
    public static void main(String[] args) {
    int r1 = 3;
    int c1 = 3;
    int r2 = 3;
    int c2 = 3;
    int[][] matrix1 = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
    };
    int[][] matrix2 = {
    {9, 7, 9},
    {2, 1, 7},
    {8, 9, 0}
    };
    int[][] productMatrix = new int[r1][c2];
    for (int i = 0; i < r1; i++) {
    for (int j = 0; j <c2; j++) {
    int sum = 0;
    for (int k = 0; k < c1; k++) {
    sum += matrix1[i][k] * matrix2[k][j];
    }
    productMatrix[i][j] = sum;
    }
    }
    System.out.println("Product of the matrices:");
    for (int i = 0; i < r1; i++) {
    for (int j = 0; j < c2; j++) {
    System.out.print(productMatrix[i][j] + " ");
    }
    System.out.println();
    }
    }
   }
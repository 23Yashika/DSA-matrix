import java.util.Scanner;

public class matrix1 {

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

       
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter elements of the matrix:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

       System.out.print("print the matrix element row wise : "); 
  for(int i=0;i<rows;i++){
    for(int j=0;j<cols;j++){
        System.out.print(matrix[i][j]+" ");
    }
  }
System.out.println();
 System.out.print("print the matrix element col wise : "); 
  for(int i=0;i<cols;i++){
    for(int j=0;j<rows;j++){
        System.out.print(matrix[j][i]+" ");
    }
  }
        sc.close();
    }
}

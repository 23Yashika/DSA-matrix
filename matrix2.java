import java.util.Scanner;

public class matrix2 {
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
int s = 0;
       System.out.print("Sum of matrix element : "); 
  for(int i=0;i<rows;i++){
    for(int j=0;j<cols;j++){
     s += matrix[i][j];
        
    }
  }
  System.out.print(s);

        sc.close();
    }
}

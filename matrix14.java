import java.util.Arrays;
import java.util.Scanner;

public class matrix14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int r = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int c = sc.nextInt();

        int[][] m = new int[r][c];
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                m[i][j] = sc.nextInt();
            }
        }
        int k=0;
    for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
               if(m[i][j] == 0){
                k++;
               }
            }
        }
        if( k > (r*c)/2){
            System.out.print("Matrix is sparse Matrix");
        }else{
            System.out.print("Matrix is not a sparse Matrix");
        }
   
    }
}


import java.util.Arrays;
import java.util.Scanner;

public class matrix10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int r = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int c = sc.nextInt();

        int[][] am = new int[r][c];
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                am[i][j] = sc.nextInt();
            }
        }

        int[][] cm = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                cm[i][j] = am[i][j];
            }
        }

        
        System.out.println("\nMatrix arranged row-wise:");
        for (int i = 0; i < r; i++) {
            Arrays.sort(am[i]); 
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(am[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nMatrix arranged column-wise:");
        for (int j = 0; j < c; j++) {
           
            int[] col = new int[r];
            for (int i = 0; i < r; i++) {
                col[i] = cm[i][j];
            }

            Arrays.sort(col); 

           
            for (int i = 0; i < r; i++) {
                cm[i][j] = col[i];
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(cm[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}

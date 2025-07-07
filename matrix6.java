import java.util.Scanner;

public class matrix6 {
          public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter number of rows: ");
        int r = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int c = sc.nextInt();

       
        int[][] am = new int[r][c];
        System.out.println("Enter elements of the matrix-A:");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                am[i][j] = sc.nextInt();
            }
        }

         int[][] bm = new int[r][c];
        System.out.println("Enter elements of the matrix-B :");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                bm[i][j] = sc.nextInt();
            }
        }

        System.out.println("addition of matrix A and B : ");
 int[][] sum = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
sum[i][j] = am[i][j] + bm[i][j];
System.out.print(sum[i][j]+" ");
            }
System.out.println();
        }
System.out.println();
System.out.println("Substraction of matrix A and B : ");
         int[][] sub = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
sub[i][j] = am[i][j] - bm[i][j];
 System.out.printf("%3d ", sub[i][j]); 
            }
System.out.println();
        }
    
}
  

}


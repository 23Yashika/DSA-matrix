import java.util.Scanner;

public class matrix9{
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

       
        System.out.println("border elements matrix : ");
 int[] bd = new int[r*c];
 int k=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
if(i==0 || i==r-1 || j==0 ||j==c-1){
    bd[k] = am[i][j];
    System.out.print(bd[k]+" ");
    k++;
}
        }
    }


          }
        }
    
    
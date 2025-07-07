import java.util.Scanner;

public class matrix7 {
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

       
        System.out.println("upper triangular matrix : ");
 int[][] ut = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
if(j>=i){
    System.out.print(am[i][j]+" ");
}else{
    System.out.print("0"+" ");
}
            }
            System.out.println();

        }
System.out.println();
System.out.println("Lower Triangular matrix : ");
         int[][] lt = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
if(i>=j){
    System.out.print(am[i][j]+" ");
}else{
    System.out.print("0"+" ");
}
            }
            System.out.println();
        }
    
}
  

          }
        


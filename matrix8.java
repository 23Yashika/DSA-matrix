import java.util.Scanner;

public class matrix8{
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

       
        System.out.println("left diagonal matrix : ");
 int[] ld = new int[r];
 int k=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
if(i==j){
    ld[k] = am[i][j];
    System.out.print(ld[k]+" ");
    k++;
}
        }
    }
System.out.println();

 System.out.println("right diagonal matrix : ");
 int[] rd = new int[r];
k=0;
        for(int m=0;m<r;m++){
            for(int j=0;j<c;j++){
if(m+j==r-1){
    rd[k] = am[m][j];
    System.out.print(rd[k]+" ");
    k++;
}
        }

    
}
  

          }
        }
    
        


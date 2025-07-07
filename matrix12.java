import java.util.Arrays;
import java.util.Scanner;

public class matrix12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int r = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int c = sc.nextInt();
int flag =1;
        int[][] m = new int[r][c];
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                m[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(m[i][j] != m[j][i]){
flag =0;
break;
                }
               
            }
             if(flag == 0){
                    break;
                }
        }
        if(flag == 1){
            System.out.println("Given matrix is Symmetric");
        }else{
             System.out.println("Given matrix is not Symmetric");
        }
      
    }
}


import java.util.Arrays;
import java.util.Scanner;

public class matrix11 {
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

        for(int i=0;i<r;i++){
            if(i%2==0){
                for(int j=0;j<r;j++){
                   
                        System.out.print(m[i][j]+" ");
                    }
                  
                }
            else{
                  for(int j=c-1;j>=0;j--){
                    
                        System.out.print(m[i][j]+" ");
                    }
                   
                
            }
        }

    }
}


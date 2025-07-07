import java.util.Arrays;
import java.util.Scanner;

public class matrix13 {
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
    int f = 1;
      for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if((i==j) && m[i][j]!=1){
                    f=0;
break;
                }
                
            }
            if(f==0){
                    break;
                }
        }
        if(f==0){
            System.out.print("Not a Identity Matrix");
        } else{
            System.out.print("An Identity Matrix");
        }

    }
}


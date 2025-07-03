import java.util.Scanner;

public class matrix5 {
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

for(int i=0;i<cols;i++){
    int max = Integer.MIN_VALUE;
    int min= Integer.MAX_VALUE;
    for(int j=0;j<rows;j++){
        if(matrix[j][i] > max){
            max = matrix[j][i];
        }
        if(matrix[j][i]<min){
            min = matrix[j][i];
        }
       
    }

     System.out.println("col : "+(i+1)+" = max : "+max+"  min : "+min);
}
  

}
}

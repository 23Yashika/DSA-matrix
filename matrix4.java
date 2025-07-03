import java.util.Scanner;

public class matrix4 {
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

for(int i=0;i<rows;i++){
    int max = Integer.MIN_VALUE;
    int min= Integer.MAX_VALUE;
    for(int j=0;j<cols;j++){
        if(matrix[i][j] > max){
            max = matrix[i][j];
        }
        if(matrix[i][j]<min){
            min = matrix[i][j];
        }
       
    }

     System.out.println("row : "+(i+1)+" = max : "+max+"  min : "+min);
}
  

}
}

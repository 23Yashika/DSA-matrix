import java.util.Scanner;

public class matrix15{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] m = new double[2][2];
        System.out.println("Enter elements of 2x2 matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                m[i][j] = sc.nextDouble();
            }
        }

       
        double det = m[0][0]*m[1][1] - m[0][1]*m[1][0];

        if (det == 0) {
            System.out.println("Inverse doesn't exist (determinant is 0)");
        } else {
            double[][] inv = new double[2][2];
            inv[0][0] = m[1][1] / det;
            inv[0][1] = -m[0][1] / det;
            inv[1][0] = -m[1][0] / det;
            inv[1][1] = m[0][0] / det;

            System.out.println("Inverse matrix:");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.printf("%.2f ", inv[i][j]);
                }
                System.out.println();
            }
        }

        sc.close();
    }
}

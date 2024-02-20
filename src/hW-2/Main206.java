import java.util.Arrays;
import java.util.Random;

public class Main206 {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = new Random().nextInt(1, 16);
            }
        }

        int det1 = determination1(0, matrix);
        int det2 = determination2(0, matrix);

        //int det1 = (matrix[0][0] + matrix[1][1] + matrix[2][2]) + (matrix[0][1] + matrix[1][2] + matrix[2][0]);
        int detFinal = det1 - det2;
        System.out.println(Arrays.deepToString(matrix));
        System.out.println(detFinal);
    }
    public static int determination1 (int det1, int[][]matrix ) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.println();
            int det15 = 1;
            int k = 0;
            int n = i;
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.println(k + " " + n);
                det15 *= matrix[k][n];
                n++;
                if (j == matrix[0].length-1) {
                    det1 += det15;
                }
                for (int l = 0; l < 1; l++) {
                    if (n == 3) {
                        k++;
                        n = 0;

                    }
                    else if (k != 2) {
                        k++;
                    }
                }
            }
        }
        return det1;
    }

    public static int determination2 (int det2, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int det25 = 1;
            int k = 0;
            int n = i;
            for (int j = 0; j < matrix[0].length; j++) {
                det25 *= matrix[k][n];
                n--;
                if (j == matrix[0].length-1) {
                    det2 += det25;
                }
                for (int l = 0; l < 1; l++) {
                    if (n == -1) {
                        k++;
                        n = 2;
                    }
                    else if (k != 2) {
                        k++;
                    }
                }
            }
        }
        return det2;
    }
}

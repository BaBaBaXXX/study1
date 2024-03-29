package controlPoints.kt2x;

import java.util.Arrays;
import java.util.Scanner;

public class kt22 {
    public static void main(String[] args) {
        int numRows = new Scanner(System.in).nextInt();
        int[][] biba = new int[numRows][];
        for (int i = 0; i < numRows; i++) {
            biba[i] = new int[i+1];
            for (int j = 0; j <= i; j++) {
                if (j != 0 && j != i) {
                    biba[i][j] = biba[i-1][j-1] + biba[i-1][j];
                }
                else
                    biba[i][j] = 1;
            }
        }
        System.out.println(Arrays.deepToString(biba));
    }
}

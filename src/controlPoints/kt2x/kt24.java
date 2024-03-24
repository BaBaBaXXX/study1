package controlPoints.kt2x;

import java.util.Scanner;

public class kt24 {

    public static void main(String[] args) {
        int compareTo = new Scanner(System.in).nextInt();
        int[] squareOfTwo = new int[32];
        boolean compare = false;
        for (int i = 0; i < squareOfTwo.length; i++) {
            squareOfTwo[i] = (int) Math.pow(2, i);
            if (compareTo == squareOfTwo[i])
                compare = true;
        }
        System.out.println(compare);
    }
}

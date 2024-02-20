import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main210 {
    public static void main(String[] args) {
        int[][]chess = new int[8][8];
        Random r = new Random();
        int a = r.nextInt(0, 8);
        int b = r.nextInt(0, 8);
        chess[a][b] = 1;
        makeBoard(chess);
        chessMove(a, b, chess);
        makeBoard(chess);
        char abc =(char) (a + 'a');
        System.out.println("Конь на позиции: "+ abc+b);


    }
    public static void chessMove (int a, int b, int[][]chess) {
        int num1 = new Scanner(System.in).nextInt();
        int num2 = new Scanner(System.in).nextInt();
        if (Math.abs(b - num2) == 2) {
            if ( (Math.abs(a - num1 ) == 1) || (num1 <= 8 || num2 <= 8) ) {
                chess[a][b] = 2;
                a = num1;
                b = num2;
                chess[a][b] = 1;
            }
        }
        else if (Math.abs(a - num1) == 2) {
            if ( (Math.abs(b - num2 ) == 1) || (num1 <= 8 || num2 <= 8) ) {
                chess[a][b] = 2;
                a = num1;
                b = num2;
                chess[a][b] = 1;
            }
        }
        else {
            System.out.println("Невозможно попасть в указанную точку с заданной координаты");
            System.exit(0);
        }
    }
    public static void makeBoard (int[][]chess) {
        System.out.print("   ");
        for (int i = 0; i < chess.length; i++) {
            System.out.print(+i + "  ");
            if (i == chess.length - 1) {
                System.out.println();
            }
        }
        for (int i = 0; i < chess.length; i++) {
            System.out.println(i + " "+ Arrays.toString(chess[i]));
        }
        for (int i = 0; i < 2; i++) {
            System.out.println();
        }
    }
}

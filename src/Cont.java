import java.util.Scanner;

public class Cont {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] inS = scan.nextLine().split(" ");
        int n = Integer.parseInt(inS[0]);
        int t = Integer.parseInt(inS[1]);
        String[] inS2 = scan.nextLine().split(" ");
        String[] inS3 = scan.nextLine().split(" ");
        int sum2 = 0;
        int sum3 = 0;
        for (int i = 0; i < inS2.length; i++) {
            sum2 += Integer.parseInt(inS2[i]);
            sum3 += Integer.parseInt(inS3[i]);
        }
        if (sum2 <= t && sum3 >= t)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}

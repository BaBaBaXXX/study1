package controlPoints.kt1x;

public class kt12 {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            if ((i % 3 == 0) && (i % 5 != 0) && (calc(i))) {
                System.out.println(i);
            }
        }
    }

    public static boolean calc (int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num = num / 10;
        }
        if (sum < 10)
            return true;
        else
            return false;
    }
}
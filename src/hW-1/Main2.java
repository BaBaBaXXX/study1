import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        String str = new Scanner(System.in).nextLine();
        int integer = Integer.parseInt(str);
        if (integer < 10 && integer >= 0) {
            System.out.println("Положительное число меньше 10 или ноль");
        }
        else {
            System.out.println("Положительное число больше 10 или отрицательное");
        }
    }
}

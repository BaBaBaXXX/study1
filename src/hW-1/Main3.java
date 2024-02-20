import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        String str = new Scanner(System.in).nextLine();
        int dig = Integer.parseInt(str);
        if (dig == 1) {
            System.out.println("Понедельник");
        }
        else if (dig == 2) {
            System.out.println("Вторник");
        }
        else if (dig == 3) {
            System.out.println("Среда");
        }
        else if (dig == 4) {
            System.out.println("Четверг");
        }
        else if (dig == 5) {
            System.out.println("Пятница");
        }
        else if (dig == 6 || dig == 7) {
            System.out.println("Выходной");
        }
    }
}

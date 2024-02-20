import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        String str = new Scanner(System.in).nextLine();
        int dig = Integer.parseInt(str);
        switch (dig) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
            case 7:
                System.out.println("Выходной");
                break;
        }
    }
}

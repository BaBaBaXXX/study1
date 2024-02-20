import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int integer = Integer.parseInt(string);
        if (integer % 2 != 0) {
            System.out.println(integer);
        }
        else {
            System.out.println("Это чётное число");
        }
    }
}
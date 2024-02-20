import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Main214 {
    public static void main(String[] args) {
        writer();
        reader();
    }
    public static void writer () {
        Scanner scan = new Scanner(System.in);
        String scanString = scan.nextLine();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("test2"))) {
            bw.write(scanString);
        }catch (Exception e) {
            System.out.println("АШИБКА!!!!!!!");
        }
    }

    public static void reader () {
        String s;
        try (BufferedReader br = new BufferedReader(new FileReader("test2"))){
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
        }catch (Exception e) {
            System.out.println("АШИПКА!!!!!!!");
        }
    }
}

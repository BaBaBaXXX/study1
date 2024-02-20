import java.util.Random;

public class Main7 {
    public static void main(String[] args) {
        Random r = new Random();
        String str = "h ";
        for (int i = 0; i < 4; ++i) {
            char c = (char)(r.nextInt(26) + 'a');
            str += c+" ";
        }
        System.out.println(str);
    }
}

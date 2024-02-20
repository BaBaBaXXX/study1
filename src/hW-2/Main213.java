import java.io.*;

public class Main213 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("test2"));
        String s;
        while ((s=br.readLine()) != null) {
            System.out.println(s);
        }
    }
}

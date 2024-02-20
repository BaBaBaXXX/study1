public class Main10 {
    public static void main(String[] args) {
        int n = (int)(Math.random()*5)+1;
        int dig = 1;
        for (int i = 0; i < n; i++) {
            dig *=(i+1);
        }
        System.out.println(n);
        System.out.println(dig);
    }
}

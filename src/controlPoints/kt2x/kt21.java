package controlPoints.kt2x;

public class kt21 {
    public static void main(String[] args) {
        String bb = "leetcode";
        String sad = "leeto";
        int index = -1;
        for (int i = 0; i <= bb.length()-sad.length(); i++) {
            if (sad.charAt(0) == bb.charAt(i))
                if (bb.substring(i, i+sad.length()).equals(sad)) {
                    System.out.println(i);
                    System.exit(0);
                }

        }
        System.out.println(index);
    }
}

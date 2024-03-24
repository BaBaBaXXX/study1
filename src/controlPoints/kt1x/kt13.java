package controlPoints.kt1x;
// делал для 14 Задания Leetcode, должно работать на любой элемент любого массива
public class kt13 {
    public static void main(String[] args) {
        String[] strs = new String[]{"flower", "flower", "flower"};
        StringBuilder str = new StringBuilder();
        for (int j = 0; j < lengthCalc(strs); j++) {
            boolean biba = false;
            for (int i = 0; i < strs.length; i++) {
                if (strs[0].charAt(j) == strs[i].charAt(j)) {
                    biba = true;
                }
                else {
                    System.out.println(str);
                    System.exit(1);
                }
            }
            if (biba)
                str.append(strs[0].charAt(j));
        }
        System.out.println(str);
    }

    public static int lengthCalc (String[] strs) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < strs.length; i++)
            min = Math.min(strs[i].length(), min);
        return min;
    }

}

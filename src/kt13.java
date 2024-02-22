public class kt13 {
    public static void main(String[] args) {
        String[] str = new String[3];
        str[0] = "flower";
        str[1] = "flow";
        str[2] = "flight";
        StringBuilder strBuild = new StringBuilder();
        for (int i = 0; i < lengthCalc(str) ; i++) {
            if (str[0].charAt(i) == str[1].charAt(i) && str[0].charAt(i) == str[2].charAt(i)) {
                strBuild.append(str[0].charAt(i));
            }
        }
        System.out.println(strBuild);
    }

    public static int lengthCalc (String[] strs) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < strs.length; i++)
            min = Math.min(strs[i].length(), min);
        return min;
    }
}

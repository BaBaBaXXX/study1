import java.util.Arrays;
import java.util.Random;

public class Main209 {
    public static void main(String[] args) {
        int[][] nums = new int[7][4];
        int max = 1;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            int max1 = 1;
            for (int j = 0; j < nums[0].length; j++) {
                nums[i][j] = new Random().nextInt(-5,6);
                max1 *= nums[i][j];
            }
            if (max < Math.abs(max1)) {
                max = Math.abs(max1);
                index = i;
            }
            System.out.println(Arrays.toString(nums[i]));
        }
        System.out.println(index);

    }
}

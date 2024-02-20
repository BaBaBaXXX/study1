import java.util.Arrays;
import java.util.Random;

public class Main202 {
    public static void main(String[] args) {
        int[] nums = new int[15];
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = new Random().nextInt(0, 10);
            if (nums[i] % 2 == 0) {
                j++;
        }
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(j);
    }
}

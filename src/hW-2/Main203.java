import java.util.Arrays;
import java.util.Random;

public class Main203 {
    public static void main(String[] args) {
        int[] nums = new int[8];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = new Random().nextInt(0,11);
        }
        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 != 0) {
                nums[i] = 0;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}

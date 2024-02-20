import java.util.Arrays;
import java.util.Random;

public class Main205 {
    public static void main(String[] args) {
        int[] nums = new int[12];
        int max = 0;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = new Random().nextInt(-15,16);
            if (max < nums[i]) {
                max = nums[i];
                index = i;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}

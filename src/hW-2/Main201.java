import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main201 {
    public static void main(String[] args) {
        Integer[] nums = new Integer[50];
        int j = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                nums[j] = i;
                j++;
            }
        }
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums, Collections.reverseOrder());
        System.out.println(Arrays.toString(nums));
    }
}

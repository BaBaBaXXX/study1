import java.util.Arrays;
import java.util.Random;

public class Main208 {
    public static void main(String[] args) {
        int[][] nums = new int[8][5];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                nums[i][j] = new Random().nextInt(10,100);
            }
            System.out.println(Arrays.toString(nums[i]));
        }
        System.out.println(Arrays.deepToString(nums));
    }
}

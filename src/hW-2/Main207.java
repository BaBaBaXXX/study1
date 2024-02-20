import java.util.Arrays;
import java.util.Random;

public class Main207 {
    public static void main(String[] args) {
        int[] nums = new int[15];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = new Random().nextInt(1,101);
        }
        System.out.println(Arrays.toString(nums));
        for (int l = 0; l < nums.length; l++) {
            for (int i = nums.length-1; i > 0; i--) {
                for (int j = i-1; j < i; j++) {
                    if (nums[i] < nums[j]) {
                        bubbleSort(i, j, nums);
                    }
                }
            }
            System.out.println(Arrays.toString(nums));
        }
    }
    public static void bubbleSort (int i, int j, int[] arr) {
        int a = arr[i];
        int b = arr[j];
        arr[i] = b;
        arr[j] = a;
    }
}

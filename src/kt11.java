import java.util.Scanner;

public class kt11 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 3, 5, 6};
        int target = new Scanner(System.in).nextInt();
        int a = indexFinder(nums, target);
        System.out.println(a);
    }

    public static int indexFinder (int[] nums, int target) {
        int x = 0;
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i])
                return i;
            else if (target > nums[i])
                x++;
        }
        return x;
    }
}

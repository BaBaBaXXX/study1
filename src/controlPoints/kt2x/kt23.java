package controlPoints.kt2x;

import java.util.Arrays;

public class kt23 {
    public static void main(String[] args) {
        int[] nums = new int[]{2,2,1,1,1,2,2};
        Arrays.sort(nums);
        int dividedNum = Math.ceilDiv(nums.length, 2);
        int count = 1;
        for (int i = 0; i < nums.length-1; i++) {

            if (nums[i] == nums[i+1])
                count++;

            else
                count = 1;

            if (count == dividedNum) {
                System.out.println(nums[i]);
                System.exit(0);
            }
        }
    }
}

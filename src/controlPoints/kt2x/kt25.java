package controlPoints.kt2x;

import java.util.ArrayList;
import java.util.Arrays;

public class kt25 {
    public static void main(String[] args) {
        int[]nums = new int[]{4,3,2,7,8,2,3,1};
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        Arrays.sort(nums);
        for(int num : nums) {
            if (!list.contains(num))
                list.add(num);
        }
        for (int i = 1; i < nums.length; i++) {
            if (!list.contains(i))
                list2.add(i);
        }
        System.out.println(list2);
    }
}

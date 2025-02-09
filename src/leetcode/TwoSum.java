package leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                result[0] = map.get(diff);
                result[1] = i;
                return result;
            }
            map.put(nums[i], i);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        int[] input = { 2, 7, 11, 15 };
        int[] result = twoSum(input, 26);
        System.out.println(result[0] + " " + result[1]);

    }
}
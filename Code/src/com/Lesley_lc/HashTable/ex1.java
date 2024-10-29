package com.Lesley_lc.HashTable;

import java.util.HashMap;
import java.util.Map;

// 两数之和

// 这个方法好厉害。不符合直觉但是很高效。

public class ex1 {
    public static int[] twoSum(int[] nums, int target) {
        int len = nums.length;

        Map<Integer, Integer> valIndexpairs = new HashMap<Integer, Integer>();
        for (int i = 0; i < len; i++) {
            if (valIndexpairs.containsKey(target - nums[i])) {
                return new int[] { valIndexpairs.get(target - nums[i]), i };
            }
            valIndexpairs.put(nums[i], i);
        }

        return new int[0];
    }

    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] ans = twoSum(nums, target);
        System.out.println(ans[0] + ", " + ans[1]);
    }
}

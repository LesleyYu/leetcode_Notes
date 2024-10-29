package com.Lesley_lc.HashTable;

import java.util.HashMap;
import java.util.Map;

public class ex219 {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> numIndex = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (numIndex.containsKey(nums[i])) { // if current num has already appeared previously
                int prevIndex = numIndex.get(nums[i]);
                if (i - prevIndex <= k)
                    return true;
            }
            numIndex.put(nums[i], i);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 1 };
        int k1 = 3;
        System.out.println(containsNearbyDuplicate(nums1, k1));

        int[] nums2 = { 1, 0, 1, 1 };
        int k2 = 1;
        System.out.println(containsNearbyDuplicate(nums2, k2));

        int[] nums3 = { 1, 2, 3, 1, 2, 3 };
        int k3 = 2;
        System.out.println(containsNearbyDuplicate(nums3, k3));
    }
}

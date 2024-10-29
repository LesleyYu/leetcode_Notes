package com.Lesley_lc.双指针;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 15. 三数之和

public class ex15 {
    public static List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();

        for (int first = 0; first <= n - 3; first++) {
            // omit nums with same values
            if (first != 0 && nums[first] == nums[first - 1])
                continue;

            int third = n - 1; // 天才
            for (int second = first + 1; second <= n - 2; second++) {
                // omit nums with same values
                if (second > first + 1 && nums[second] == nums[second - 1]) // second > first + 1 这个不能漏了
                    continue;

                // int third = n - 1; // 不在这里，在外面。节省时间复杂度
                // 寻找：直到 第二数和第三数重合 ；或 三数之和 <= 0
                while (second < third && nums[first] + nums[second] + nums[third] > 0) {
                    third--;
                }
                if (second == third)
                    break; // 找不到咯
                if (nums[first] + nums[second] + nums[third] == 0) { // 找到咯
                    // 放到 ans 里 // 学学 Java 数据结构吧宝宝
                    List<Integer> row = new ArrayList<>();
                    row.add(nums[first]);
                    row.add(nums[second]);
                    row.add(nums[third]);
                    ans.add(row);
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums1 = new int[] { -1, 0, 1, 2, -1, -4 };
        int[] nums2 = new int[] { 0, 1, 1 };
        int[] nums3 = new int[] { 0, 0, 0 };

        System.out.println(String.valueOf(threeSum(nums1).get(0)));
        // System.out.println(String.valueOf(threeSum(nums2).get(0)));
        System.out.println(String.valueOf(threeSum(nums3).get(0)));

    }
}

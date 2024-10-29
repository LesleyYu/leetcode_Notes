package com.Lesley_lc.range;

import java.util.ArrayList;
import java.util.List;

// 228. 汇总区间
// method 1 
// better than 35.92%    needs improving

public class ex228 {
    public static List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<String>();
        if (nums.length == 0)
            return ans;

        int[] temp = { nums[0], nums[0] };
        for (int i = 1; i < nums.length; i++) {
            // System.out.println("temp[1] = " + temp[1]);
            // System.out.println("nums[i] = " + nums[i]);
            if (temp[1] + 1 == nums[i]) {
                // System.out.println("temp[1]++");
                temp[1]++;
            } else {
                if (temp[0] == temp[1]) {
                    ans.add(Integer.toString(temp[0]));
                    // System.out.println("print single " + Integer.toString(temp[0]));
                } else {
                    ans.add(temp[0] + "->" + temp[1]);
                    // System.out.println("print range " + temp[0] + "->" + temp[1]);
                }
                temp[0] = nums[i];
                temp[1] = nums[i];
            }

        }
        if (temp[0] == temp[1]) {
            ans.add(Integer.toString(temp[0]));
            // System.out.println("print single " + Integer.toString(temp[0]));
        } else {
            ans.add(temp[0] + "->" + temp[1]);
            // System.out.println("print range " + temp[0] + "->" + temp[1]);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums1 = { 0, 1, 2, 4, 5, 7 };
        System.out.println(summaryRanges(nums1));

        System.out.println("===========");

        int[] nums2 = { 0, 2, 3, 4, 6, 8, 9 };
        System.out.println(summaryRanges(nums2));

        System.out.println("===========");
        int[] nums3 = {};
        System.out.println(summaryRanges(nums3));

        System.out.println("===========");
        int[] nums4 = { -1, 2 };
        System.out.println(summaryRanges(nums4));
    }
}

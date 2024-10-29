package com.Lesley_lc.HashTable;

import java.util.Set;
import java.util.HashSet;

// 128. 最长连续序列
// 知识点：
// 1. 对set的使用
// 2. set内的成员进行检索的复杂度是n(O) 

public class ex128 {
    public static int longestConsecutive(int[] nums) {
        Set<Integer> nums_set = new HashSet<>();
        for (int num : nums) {
            nums_set.add(num);
        }

        int longestStreak = 0;
        for (int num : nums_set) {
            if (!nums_set.contains(num - 1)) {
                int currentStreak = 1;
                while (nums_set.contains(num + 1)) {
                    currentStreak++;
                    num++;
                }
                if (currentStreak > longestStreak)
                    longestStreak = currentStreak;
            }
        }
        return longestStreak;
    }

    public static void main(String[] args) {
        int[] nums1 = { 100, 4, 200, 1, 3, 2 };
        System.out.println(longestConsecutive(nums1));
    }
}

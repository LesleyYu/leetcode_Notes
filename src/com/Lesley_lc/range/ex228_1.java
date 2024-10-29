package com.Lesley_lc.range;

import java.util.ArrayList;
import java.util.List;

// 228. 汇总区间
// method 2 分组循环
// 分组循环的模版：
// i, n = 0, len(nums)
// while i < n:
//     start = i
//     while i < n and ...:
//         i += 1
//     # 从 start 到 i-1 是一段
//     # 下一段从 i 开始，无需 i+=1

// 摘自题解（非官方）
// 还有相关的联系题可以去加强一下记忆和熟练度

public class ex228_1 {
    public static List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<String>();
        int n = nums.length;
        // int start = 0, end = 0;
        for (int i = 0; i < n; i++) {
            int start = i, end = start;
            StringBuffer temp = new StringBuffer(Integer.toString(nums[start]));
            while (i < n - 1 && nums[i] + 1 == nums[i + 1]) { // why n-1? not n?
                i++;
            }
            end = i;
            if (start == end) {
                ans.add(temp.toString());
            } else {
                temp.append("->" + Integer.toString(nums[end]));
                ans.add(temp.toString());
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums1 = { 0, 1, 2, 4, 5, 7, 8 };
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

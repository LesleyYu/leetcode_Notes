package com.Lesley_lc.slidingWindow;

/*
 * 时间击败95.74%, 内存击败99.97%。

因为我们已经保证了当前区间没有重复值，当右指针右移一个位置，只需要遍历区间，找出其中与右指针当前元素相同的元素即可(最多1个）。如果存在，这个元素以及其左侧的元素都可以舍弃掉， 左指针 = 相同元素位置+1。

时间复杂度O(N*∣Σ∣)。因为不重复子串区间长度不会超过ASCII 码字符集的长度∣Σ∣=128，当N足够大时，时间复杂度接近O(N)。

空间复杂度O(1)。跟官方解法相比，这个解法省去了哈希表占用的空间。
 */

public class ex3_2 {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, length = 0, max = 0;
        for (int right = 0; right < s.length(); right++) {
            for (int k = left; k < right; k++) {
                if (s.charAt(k) == s.charAt(right)) {
                    left = k + 1;
                    length = right - left;
                    break;
                }
            }
            length++;
            if (max < length)
                max = length;
        }
        return max;
    }
}

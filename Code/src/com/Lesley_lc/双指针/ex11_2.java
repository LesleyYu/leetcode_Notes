package com.Lesley_lc.双指针;

// 11. 盛最多水的容器

public class ex11_2 {
    public static int maxArea(int[] height) {
        int n = height.length;
        // int maxi = height[0], maxj = height[n - 1];
        // int maxVol = Math.min(height[maxi], height[maxj]) * (maxj - maxi);
        int maxi = 0, maxj = n-1;
        int maxVol = Math.min(height[0], height[n-1]) * (n-1 - 0);
        int max_i_j = (height[0] > height[n-1]) ? 0 : n-1;

        for (int i = 0, j = n-1; i < j; ) {
            if (max_i_j == i) {
                j--;
                if (height[j-1] > height[j] && height[j] < j-1-i) {
                    max_i_j = (height[i] > height[j]) ? i : j;
                }
            }
            else if (max_i_j == j && height)
        }
        
        return maxVol;
    }

    public static void main(String[] args) {
        int[] height1 = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        int[] height2 = { 1, 1 };

        System.out.println(maxArea(height1));
        System.out.println(maxArea(height2));
    }

}

package com.Lesley_lc.双指针;

// 11. 盛最多水的容器

// 不对啊 而且太麻烦了 重写！！
public class ex11 {
    public static int maxArea(int[] height) {
        int n = height.length;
        int maxi = height[0], maxj = height[n - 1];
        int maxVol = Math.min(height[maxi], height[maxj]) * (maxj - maxi);

        for (int i = 1, j = n - 2; i < j;) {
            // int volij = Math.min(height[i], height[j]) * (j-i);
            int vol_maxi_j = Math.min(height[maxi], height[j]) * (j - maxi);
            int vol_i_maxj = Math.min(height[i], height[maxj]) * (maxj - i);

            if (height[i] > maxi && vol_maxi_j > maxVol) {
                maxVol = vol_maxi_j;
                System.out.println("maxVol" + maxVol);
                maxi = i++;
                System.out.println("maxi = " + maxi);
            }
            if (height[j] > maxj && vol_i_maxj > maxVol) {
                maxVol = vol_i_maxj;
                System.out.println("maxVol" + maxVol);
                maxj = j--;
                System.out.println("maxj = " + maxj);
            }
            j--;
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

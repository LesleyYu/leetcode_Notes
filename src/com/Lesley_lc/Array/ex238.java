// 没想出来

// 官方题解 一

import java.util.Arrays;

public class ex238 {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int[] L = new int[n];
        int[] R = new int[n];

        // 第 i 个数的左侧乘积
        L[0] = 1;
        for (int i = 1; i < n; i++) {
            L[i] = L[i-1] * nums[i-1];
        }

        // 第 i 个数的右侧乘积
        R[n-1] = 1;
        for (int i = n-2; i >= 0; i--) {
            R[i] = R[i+1] * nums[i+1];
        }

        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = L[i] * R[i];
        }

        return result;
    }

    public static void main(String[] args) {
        // case 1
        int[] nums = {1,2,3,4};

        // case 2
        // int[] nums = {-1,1,0,-3,3};

        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
}


// 官方题解 二
// 由 官方题解 一进行了改良

import java.util.Arrays;

public class ex238_2 {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int R = 1;
        int[] result = new int[n];

        // 第 i 个数的左侧乘积
        result[0] = 1;
        for (int i = 1; i < n; i++) {
            result[i] = result[i-1] * nums[i-1];
        }

        // R 存了第 i 个数的右侧乘积
        for (int i = n-1; i >= 0; i--) {
            result[i] = R * result[i];
            R *= nums[i];
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

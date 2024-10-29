import java.util.Arrays;

public class ex189 {
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        if (n == 1) return;

        for (int i = 0; i < k; i++) {
            int temp = nums[n-1];
            for (int j = n-2; j>=0; j--) {
                nums[j+1] = nums[j];
            }
            nums[0] = temp;

            System.out.println(Arrays.toString(nums));
        }
    }

    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7};
        int k = 3;

        rotate(nums, k);

        System.out.println(Arrays.toString(nums));
    }
}

// 思路：向右移动 k 次
// 超出时间限制
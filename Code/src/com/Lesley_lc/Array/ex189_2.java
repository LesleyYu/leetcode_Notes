import java.lang.reflect.Array;
import java.util.Arrays;

public class ex189_2 {
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        if (n == 1) return;

        k = k % n;

        // store the last k items
        int [] temp = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = nums[n-k+i];
        }
        // System.out.println(temp[0]);

        // rotate step k at once
        for (int i = n-1; i >= k; i--) {
            nums[i] = nums[i-k];
        }
        // System.out.println(nums[3]);

        // put the last k items at the start
        for (int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7};
        int k = 3;

        rotate(nums, k);

        System.out.println(Arrays.toString(nums));
    }
}

// 思路：
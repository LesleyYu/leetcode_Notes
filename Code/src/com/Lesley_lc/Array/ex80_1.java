import java.util.Arrays;

public class ex80_1 {
    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        // length <= 2
        if (n <= 2) {
            return n;
        }

        // length >= 3
        int slow = 2, fast = 2;
        while (fast < n) {
            if (nums[slow - 2] != nums[fast]) {
                nums[slow] = nums[fast];
                ++slow;
            }
            ++fast;
        }
        return slow;
    } 

    public static void main(String[] args) {
        // case 1
        // int[] nums = {1, 1, 1, 2, 2, 3};

        // case 2
        // int[] nums = {0,0,1,1,1,1,2,3,3};

        // case 3
        // int[] nums = {1,1,1,1};

        // case 4
        int[] nums = {1,1,2,2};

        int len = removeDuplicates(nums);
        System.out.println(len);
        System.out.println(Arrays.toString(nums));
    }
}

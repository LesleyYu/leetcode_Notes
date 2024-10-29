import java.util.Arrays;

public class ex80_2 {
    
    public static int removeDuplicates(int[] nums) {
        int slow = 0;
        for (int fast = slow + 2; fast < nums.length; fast++) {
            if (nums[slow] < nums[fast]) {
                nums[slow + 2] = nums[fast];
                slow++;
            }
        }
        return slow + 2;
    }


    public static void main(String[] args) {
        // case 1
        // int[] nums = {1, 1, 1, 2, 2, 3};

        // case 2
        int[] nums = {0,0,1,1,1,1,2,3,3};

        // case 3
        // int[] nums = {1,1,1,1};

        // case 4
        // int[] nums = {1,1,2,2};

        // case 5

        int len = removeDuplicates(nums);
        System.out.println(len);
        System.out.println(Arrays.toString(nums));
    }
}

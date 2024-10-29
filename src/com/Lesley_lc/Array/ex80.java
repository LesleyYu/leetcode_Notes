import java.util.Arrays;

public class ex80 {
    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        // length = 1 or 2
        if (n < 3) return n;

        // length = 3
        if (n == 3) {
            if (nums[2] != nums[0]) return 3;
            else return 2;
        }

        // length > 3
        int slow = 2, fast = 3;
        // slow: index to be written over 被写掉 覆盖掉的
        // fast: index to be written to [slow]  被写到[slow]那里的值
        
        outer:
        while (fast < n) {
            // System.out.println("slow=" + slow);
            // System.out.println("fast=" + fast);

            if (nums[slow-2] == nums[slow] || nums[slow-1] > nums[slow]) {  // find slow
                while (nums[fast-2] == nums[fast]) {
                    fast++;   // fast found
                    if (fast >= n-1) break outer;  // fast not found
                }
                // System.out.println(fast);
                nums[slow++] = nums[fast++];   // 赋值 && 递增
            }
            else {
                slow++; fast++; // 递增
            }
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
        int[] nums = {1,1,2,2};     //  错误！！！！！

        int len = removeDuplicates(nums);
        System.out.println(len);
        System.out.println(Arrays.toString(nums));
    }
}

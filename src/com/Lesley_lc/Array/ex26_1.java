public class ex26_1 {
    public static int removeDuplicates (int[] nums) {
        // nums 长度为1
        if (nums.length == 1) return 1;

        // nums1 长度大于1
        // 优化： 不需要temp
        int slow = 1, fast = 1;
        for (; fast < nums.length; fast++) {
            if (nums[fast-1] != nums[fast]) {
                nums[slow++] = nums[fast];
            }
        }

        return slow;
    }
}

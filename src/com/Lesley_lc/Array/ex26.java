public class ex26 {
    public static int removeDuplicates(int[] nums) {
        // nums 长度为0，不存在这种情况
        // if (nums == null || nums.length == 0)  return [null]; 
        // nums 长度为1
        if (nums.length == 1) return 1;
        
        // nums 长度大于1
        int temp = nums[0];
        int slow = 1;
        for (int fast = 1; fast < nums.length; fast++) {
            if (temp != nums[fast]) {
                temp = nums[fast];
                nums[slow++] = nums[fast];
            }
        }

        return slow;
    }
}

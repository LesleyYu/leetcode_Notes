import java.util.Arrays;

class ex27_1 {
    public static int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) return 0;

        int slow = 0;
        for (int fast = 0; fast < nums.length ; fast++) {
            if (nums[fast] != val) {
                nums[slow++] = nums[fast];
            }
        }
        System.out.println(Arrays.toString(nums));
        return slow;

    }


    public static void main(String[] args) {
        // case 1
        // int[] nums = {3,2,2,3}; // 输入数组
        // int val = 3; // 要移除的值

        // case 2
        // int[] nums = {0,1,2,2,3,0,4,2}; // 输入数组
        // int val = 2; // 要移除的值

        // case 3
        int[] nums = {4, 5};
        int val = 4;

        int k = removeElement(nums, val); // 调用你的实现

        System.out.println(k);
    }
}
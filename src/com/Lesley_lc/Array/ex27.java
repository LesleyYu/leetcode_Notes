import java.util.Arrays;

class ex27 {
    public static int removeElement(int[] nums, int val) {
        if (nums.length == 0) return 0;

        int left = 0, right = nums.length-1;
        while (left < right) {
            if (nums[left] != val) left++;
            else {
                if (nums[right] == val) right--;
                else {
                    nums[left++] = nums[right--];
                }
            }
        }

        System.out.println(Arrays.toString(nums));

        if (nums[left] == val || left > right) return left;
        else return left+1;
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
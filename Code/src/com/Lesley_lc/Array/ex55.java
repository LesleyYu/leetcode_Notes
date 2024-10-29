public class ex55 {
    public static boolean canJump(int[] nums) {
        int n = nums.length;

        findZero:
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                int flag = 0;
                for (int j = i-1; j >= 0; j--) {
                    if (nums[j] > i-j) {
                        flag = 1;
                        continue findZero;
                    }
                }
                if (flag == 0) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // case 1
        // int[] nums = {2,3,1,1,4};

        // case 2
        int[] nums = {3,2,1,0,4};

        System.out.println(canJump(nums));
    }
}

public class ex45 {
    public static int jump(int[] nums) {
        int n = nums.length;
        if (n == 1) return 0;

        int count = 0;  // start index and count
        int min = 0, max = 0;   // find range for next loop
        int temp_min = 0, temp_max = 0; // range in current loop
        while (max < n) {
            if (max == n-1) break;
            
            // initialize range in current loop
            temp_min = min;
            temp_max = max;
            // initialize min in current loop
            min += 1;

            // start finding range for next loop
            for (int j = temp_min; j <= temp_max; j++) {
                max = Math.max(j + nums[j], max);
                min = Math.min(j + nums[j], min);
                System.out.println(min);
            }
            count++;
            // System.out.println(count);
        }

        return count;
    }

    public static void main(String[] args) {
        // case 1
        int [] nums = {2,3,0,1,4};

        System.out.println(jump(nums));
    }
}

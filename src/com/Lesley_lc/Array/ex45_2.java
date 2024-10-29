// 操 没写出来

public class ex45_2 {
    public static int jump(int[] nums) {
        int n = nums.length;
        if (n == 1) return 0;

        int count = 0, i = 0;
        while (i < n) {
            int max = 0;

            // loop:  nums[i]+1  ~  num[i]+i
            for (int j = nums[i]+1; j < nums[i]+i; j++) {
                System.out.println("j = " + j);
                if (j+nums[j] > max) {
                    max = j+nums[j];
                    i = j;
                    System.out.println("i = " + i);
                }
            }

            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        
        // case 1
        int [] nums = {2,3,0,1,4, 4};

        System.out.println(jump(nums));
    }
}

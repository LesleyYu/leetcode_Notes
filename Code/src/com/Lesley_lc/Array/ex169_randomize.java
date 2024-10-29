import java.util.Random;

public class ex169_randomize {
    private static int countOccurance (int[] nums, int n) {
        int count = 0;
        for (int num: nums) {
            if (num == n) count++;
        }
        return count;
    }
    public static int majorityElement (int[] nums) {
        Random rand = new Random();
        
        while(true) {
            // 随机找一个数
            int n = nums[rand.nextInt(nums.length)];
            // 对这个数的出现次数进行计数
            int count = countOccurance(nums, n);
            System.out.println(n + " appeared: " + count + " times.");
            // 输出
            if (count >= nums.length / 2) return n;
        }
    }

    public static void main(String[] args) {
        // case 1
        // int[] nums = {3, 2, 3};

        // case 2
        int[] nums = {2,2,1,1,1,2,2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4};

        System.out.println(majorityElement(nums));
    }
}

// 时间复杂度： O(n)
// 比较难算。看官方题解

// 空间复杂度：O(1)
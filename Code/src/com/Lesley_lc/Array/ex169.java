import java.util.HashMap;

public class ex169 {
    public static int majorityElement (int[] nums) {
        if (nums.length == 1) return nums[0];

        HashMap<Integer, Integer> store = new HashMap<Integer, Integer>();

        for (int num: nums) {
            if (store.get(num) == null) store.put(num, 1);
            else {
                int n = store.get(num);
                store.put(num, n+1);
                if (n+1 > nums.length / 2) return num;
            }
        }
        return -1;
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

// 空间复杂度：O(n)
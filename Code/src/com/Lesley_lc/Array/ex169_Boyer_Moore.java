import java.util.Random;

public class ex169_Boyer_Moore {
    
    
    public static int majorityElement (int[] nums) {
        
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
// 比较难算。看官方题解

// 空间复杂度：O(1)
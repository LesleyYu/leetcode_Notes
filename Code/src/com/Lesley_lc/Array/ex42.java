
public class ex42 {
    public static int trap(int[] height) {
        int n = height.length;
        // if (n == 1)

        int[] leftMax = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        int[] rightMax = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        int sum = 0; // 返回的结果
        for (int i = 0; i < n; i++) {
            sum += Math.min(leftMax[i], rightMax[i]) - height[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        // case 1
        int[] height1 = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };

        // case 2
        int[] height2 = { 4, 2, 0, 3, 2, 5 };

        System.out.println(trap(height1)); // 6
        System.out.println(trap(height2)); // 9
    }
}

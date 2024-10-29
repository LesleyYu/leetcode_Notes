// 思路同 ex121

public class ex122 {
    public static int maxProfit(int[] prices) {
        int n = prices.length;
        if (n == 1) return 0;

        int min = prices[0], max = 0, profit = 0, temp_profit =0;
        for (int i = 1; i < n; i++) {
            if ( prices[i] < prices[i-1]) {
                profit += temp_profit; // accumulate profit
                System.out.println("i = " + i + ", profit = " + profit );

                // clear to default
                min = prices[i];
                max = 0;
                temp_profit = 0;
            }
            max = (prices[i] > max) ? prices[i] : max;
            // System.out.println(max);
            int deduc = (max > min) ? (max - min) : 0;
            temp_profit = (deduc > temp_profit) ? deduc : temp_profit;
        }
        if (prices[n-1] > min) profit += (prices[n-1] - min);

        return profit;
    }

    public static void main(String[] args) {
        // case 1
        // int[] nums = {7,1,5,3,6,4};
        
        // case 2
        int[] nums = {1,2,3,4,5};

        System.out.println(maxProfit(nums));
    }
}

public class ex121 {
    
    public static int maxProfit(int[] prices) {
        int n = prices.length;
        if (n == 1) return 0;

        int min = prices[0];
        int profit = 0;
        for (int i = 1; i < n; i++) {
            int deduc = prices[i] - min;
            int temp_profit = deduc>0 ?  deduc : 0;
            profit = temp_profit > profit ? temp_profit : profit;
            min = prices[i] < min ? prices[i] : min;
        }
        return profit;
    }

    public static void main(String[] args) {
        // case 1
        int[] nums = {7,1,5,3,6,4};

        System.out.println(maxProfit(nums));
    }
}

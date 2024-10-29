public class ex122_greedy {
    
    public static int maxProfit(int[] prices) {
        
        int n = prices.length;
        if (n == 1) return 0;

        int profit = 0;
        // int min = prices[0];
        for (int i = 1; i < n; i++) {
            int deduc = (prices[i] > prices[i-1]) ? prices[i]-prices[i-1] : 0;
            profit += deduc;
        }

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

// 错误

public class ex134_2 {
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;

        int[] arrive_cost = new int[n];
        arrive_cost[0] = gas[0] - cost[n-1];
        int sum = arrive_cost[0], max = 0;
        for (int i = 1; i < n; i++) {
            arrive_cost[i] = gas[i] - cost[i-1];
            sum += arrive_cost[i];
            max = (arrive_cost[max] < arrive_cost[i]) ? i : max;
            System.out.println("max = " + max);
        }

        if (sum < 0) return -1;
        // 不能这么写
        // else return (max > 0) ? (max - 1) : (max + n - 1);   
        // 反例： case 4
        
        return -1;
    }

    public static void main(String[] args) {

        // // case 1
        int[] gas1 = {1,2,3,4,5};
        int[] cost1 = {3,4,5,1,2};
        // 3

        // case 2
        int[] gas2 = {4};
        int[] cost2 = {5};
        // -1

        // case 3
        int[] gas3 = {5,1,2,3,4};
        int[] cost3 = {4,4,1,5,1};

        // case 4
        int[] gas4 = {5,8,2,8};
        int[] cost4 = {6,5,6,6};
        // 3

        System.out.println("1: "+ canCompleteCircuit(gas1, cost1));
        System.out.println("2: "+ canCompleteCircuit(gas2, cost2));
        System.out.println("3: "+ canCompleteCircuit(gas3, cost3));
        System.out.println("4: "+ canCompleteCircuit(gas4, cost4));
    }
}

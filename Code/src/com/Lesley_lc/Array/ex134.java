// 最直觉的办法：两个loop
// O(n^2)

public class ex134 {
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;

        for (int i = 0; i < n; i++) {
            int remain = 0 + gas[i];
            
            boolean isComplete = true;
            for (int j = i; j < i+n; j++) {
                int c = j % n;
                System.out.println("remain a = " + remain);
                remain -= cost[c];
                System.out.println("remain b = " + remain);
                if (remain < 0) {
                    System.out.println("break");
                    isComplete = false;
                    break;
                }
                int g = (c+1) % n;
                remain += gas[g];
            }
            if (isComplete == true) return i;
        }

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

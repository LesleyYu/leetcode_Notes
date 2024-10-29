public class ex135_2 {
    public static int candy(int[] ratings) {
        int n = ratings.length;
        if (n == 1) return 1;

        int i= 1, range_count = 0, min = 1, sum = 1, last_elem = 1;
        int isBigger = (ratings[1] > ratings[0]) ? 1 : (ratings[1] == ratings[0]) ? 0 : -1;
        while (i < n) {
            if (ratings[i] >= ratings[i-1]) {
                if (isBigger == 1) {
                    System.out.println("递增");
                    range_count++;
                    sum += (last_elem++ +1);
                }
                else {
                    System.out.println("停止递减，结算");
                    sum += range_count * (1 - min);
                    range_count = 1;
                    last_elem = 1;
                    min = 1;
                    isBigger = 1;
                }
            }
            else if(ratings[i] < ratings[i-1]) {
                if (isBigger == -1) {
                    System.out.println("递减");
                    range_count++;
                    sum += (last_elem-- -1);
                    min--;
                }
                else {
                    System.out.println("停止递增，结算");
                    range_count = 1;
                    last_elem = 1;
                    // min = 1;
                    isBigger = -1;
                }
            }
            i++;
        }

        return sum;
    }

    public static void main(String[] args) {
        // case 1
        int[] ratings1 = {1,0,2};

        // case 2
        int[] ratings2 = {1,2,2};

        // case 3
        int[] ratings3 = {1, 2, 3, 4, 4, 2, 2, 5, 6, 7};

        System.out.println("ratings1: " + candy(ratings1) + "\n\n\n");  // 5
        System.out.println("ratings2: " + candy(ratings2) + "\n\n\n");  // 4
        System.out.println("ratings3: " + candy(ratings3) + "\n");      // 23
    }
}

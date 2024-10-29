// 解答错误：
// 反例：[1,3,4,5,2]

public class ex135 {
    public static int candy(int[] ratings) {
        int n = ratings.length;
        if (n == 1) return 1;
        
        int[] level = new int[n];   // 储存相对前一个rating的大小，大就+1，小就-1
        level[0] = 1;   // 第一个rating的起始值是 1

        int i = 1, min = 1, left = 0, right = 0, sum = 1;
        // min 为 从 left 到 right 的范围内，相对最小的值
        // left 到 right 的范围，是由：前后两个 rating 是否相等 决定的     // 错误！！
        // left 到 right 的范围，应该是由： 一直递增 或 一直递减 的范围 决定的
        boolean isBigger = ratings[1] > ratings[0] ? true : false;
        while (i < n) {
            System.out.println(("\ni = " + i));
            if (ratings[i] == ratings[i-1]) {
                // // 结算上一个范围
                // right = i-1;
                // // System.out.println("right = " + right);
                // int deduc = 1-min;
                // // System.out.println("deduc = " + deduc);
                // sum += deduc * (right - left + 1);
                // // System.out.println("sum = " + sum);
                sum += addUp(level, left, i-1, 1-min);

                // 初始化下一个范围
                min = 1;
                left = i;
                level[i] = 1;
                System.out.println("level["+i+"] = " + level[i]);
                sum += level[i];
            }

            else if (ratings[i] > ratings[i-1]) {
                if (isBigger) {
                    System.out.println("累加");
                    level[i] = level[i-1] + 1;
                    System.out.println("level["+i+"] = " + level[i]);
                    sum += level[i];
                    System.out.println("sum = " + sum);
                }
                else {
                    System.out.println("停止累减结算");
                    isBigger = true;
                    sum += addUp(level, left, i-1, 1-min);
                    // 初始化下一个范围
                    min = 1;
                    left = i;
                    // level[i] = 1;
                    System.out.println("level["+i+"] = " + level[i]);
                    // sum += level[i];
                    sum ++;
                }
            }

            else if (ratings[i] < ratings[i-1]) {
                if (!isBigger) {
                    System.out.println("累减");
                    level[i] = level[i-1] - 1;
                    System.out.println("level["+i+"] = " + level[i]);
                    sum += level[i];
                    System.out.println("sum = " + sum);
                    min = (level[i] < min) ? level[i] : min;
                    System.out.println("min = " + min);
                }
                else {
                    System.out.println("停止累加结算");
                    isBigger = false;
                    sum += addUp(level, left, i-1, 1-min);
                    // 初始化下一个范围
                    min = 1;
                    left = i;
                    level[i] = 1;
                    System.out.println("level["+i+"] = " + level[i]);
                    sum += level[i];
                }
            }


            if (i == n-1) {
                System.out.println("The last element: ");
                right = i;
                System.out.println("left = " + left);
                System.out.println("right = " + right);
                int deduc = 1-min;
                System.out.println("deduc = " + deduc);
                sum += deduc * (right - left + 1);
                System.out.println("sum = " + sum);
            }
            i++;
        }

        return sum;
    }

    // 结算
    public static int addUp(int[] level, int left, int right, int deduc) {
        return deduc * (right - left + 1);
    }

    public static void main(String[] args) {
        // case 1
        int[] ratings1 = {1,0,2};

        // case 2
        int[] ratings2 = {1,2,2};

        // case 3
        int[] ratings3 = {1, 2, 3, 4, 4, 2, 2, 5, 6, 7};

        System.out.println("ratings1: " + candy(ratings1) + "\n\n\n");
        System.out.println("ratings2: " + candy(ratings2) + "\n\n\n");
        System.out.println("ratings3: " + candy(ratings3) + "\n");
    }
}

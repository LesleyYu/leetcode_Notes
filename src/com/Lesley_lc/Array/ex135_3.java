// 第二个官方解答的带注释版本

class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int sum = 1;    //用于记录答案
        
        int pre = 1, dec = 0, inc = 1;
        // pre 用于记录前一个同学分得的糖果数量
        // dec 用于记录 递减序列的长度
        // inc 用于记录 递增序列的长度

        for (int i = 1; i < n; i++) {
            if (ratings[i] >= ratings[i-1]) {
                //处于递增序列中
                dec = 0;    //递减序列长度在递增序列中始终为0
                pre = (ratings[i] > ratings[i-1]) ? pre+1 : 1;
                    //当前同学和上一个同学分数相等时，直接分配1个就行，这样满足最小
                sum += pre;
                inc = pre;        //inc用于记录上一个递增序列的长度
                    // inc 不能是 inc++
            }
            else {
                //处于递减序列中
                dec++;

                //当递减序列长度和递增序列长度相等时，把递增序列的最后一个同学分配到递减序列中
                if (dec == inc) dec++;      // 天才
                sum += dec;
                pre = 1;// pre 在递减序列中没有意义，因为我肯定比前一个同学少
                        // ；这里就是保证 inc 递增序列开始时，pre的初始值一定为 1
            }
        }
        
        return sum;
    }
 }
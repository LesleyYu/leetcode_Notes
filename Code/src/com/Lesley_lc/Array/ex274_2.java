// 官方题解 方法二：计数排序

public class ex274_2 {
    
    
    public static int hIndex(int[] citations) {
        int n = citations.length, tot = 0;
        // counter 储存了 不同引用次数，对应的文章数量
        int[] counter = new int[n + 1];     // 引用次数为 0～n，其中n包含了 >n
        for (int i = 0; i < n; i++) {
            if (citations[i] >= n) {
                counter[n]++;
            } else {
                counter[citations[i]]++;
            }
        }
        for (int i = n; i >= 0; i--) {
            tot += counter[i];  // tot表示，引用次数为 n 递减到 i 对应的 文章 的总和
            if (tot >= i) {     // 天才 
                return i;
            }
        }
        return 0;
    }
    

    public static void main(String[] args) {
        // case 1
        int [] citations = {3,0,6,1,5};

        System.out.println(hIndex(citations));

    }
    
}

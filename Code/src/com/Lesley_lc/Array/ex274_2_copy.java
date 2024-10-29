// 官方题解 方法二：计数排序

public class ex274_2_copy {
    public static int hIndex(int[] citations) {
        int n = citations.length;

        // counter: number of articles with [?] citations        
        int[] counter = new int[n+1];
        for (int i = 0; i < n; i++) {
            if(citations[i] >= n)  counter[n]++;
            else counter[citations[i]] ++;
        }

        // total: number of articles with cit >= i
        int total = 0;  
        for (int i = n; i>= 0; i--) {
            total += counter[i];     // accumulate the total number
            System.out.println("total " + total);
            if(total >= i) return i;
        }
        
        return 0;
    }
    

    public static void main(String[] args) {
        // case 1
        // int [] citations = {3,0,6,1,5};

        // case 2
        int [] citations = {1, 3, 1};
        
        System.out.println(hIndex(citations));

    }
    
}

// 官方题解 方法三：二分搜索（binary search）

/*
 * 重点：mid 的计算
 * mid = (left + right + 1) / 2 
 * 其中 +1 防止死循环      
 * 天才
 */


public class ex274_binary {
    
    public static int hIndex(int[] citations) {
        int n = citations.length;

        int left = 0, right = n-1;
        while (left < right) {
            // mid = (left + right + 1) / 2 其中 +1 防止死循环      // 天才
            int count = 0, mid = (left+right+1) / 2;
            for (int i = 0; i < n; i++) {
                if (citations[i] >= mid) count++;
            }
            if (count > mid) left = mid + 1;
            else right = mid;

            System.out.println("mid " + mid);
            System.out.println("left " + left);
            System.out.println("right " + right);
            System.out.println();
        }
        
        return right;
    }

    public static void main(String[] args) {
        // case 1
        int [] citations = {3,0,6,1,5};
        
        // case 2
        // int [] citations = {1,3,1};

        System.out.println(hIndex(citations));
    }
    
}

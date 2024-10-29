// 没写出来

import java.util.Arrays;

public class ex274 {
    
    public static int hIndex(int[] citations) {
        int n = citations.length;
        if (n == 1 && citations[0] == 0) return 0;      // [0]

        Arrays.sort(citations);
        int i = n/2, h = citations[i];
        
        while(i > 0) {

        }

        return 1;
    }

    public static void main(String[] args) {
        // case 1
        int [] citations = {3,0,6,1,5};

        System.out.println(hIndex(citations));

        // System.out.println(3/2);    // 1
    }
    
}

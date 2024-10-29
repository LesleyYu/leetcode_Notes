package com.Lesley_lc.range;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// 56. 合并区间

// 知识点缺乏很多！
// 1. 如何 initialize 一个 list of list of integer ———— line 39
// 2. 如何 在一句话里 initialize 一个数组（array of int） 并 添加到 list of list of integer 中 ———— line 41
// 3. Arrays.sort 不是 Array
// 4. Arrays.sort(T[] a, Comparator<? super T> c)       
//      https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html
// 5. Interface Comparator<T>
//      method: compare(T o1, T o2)

public class ex56 {
    public static int[][] merge(int[][] intervals) {
        int n = intervals.length;
        if (n == 0) {
            return new int[0][2];
        }

        // sort outer array using the 1st index
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] intervals1, int[] intervals2) {
                return intervals1[0] - intervals2[0];
            }
        });

        // initialize the return variable
        List<int[]> ans = new ArrayList<int[]>();// don't have to be List<List<Integer>> because length of 2 is fixed.
        // int[] temp = new int[2]; // int[2] states the length.

        // starts merging
        for (int i = 0; i < n; i++) {
            int L = intervals[i][0], R = intervals[i][1];
            if (ans.size() == 0 || ans.get(ans.size() - 1)[1] < L) {
                ans.add(new int[] { L, R });
            } else {
                ans.get(ans.size() - 1)[1] = Math.max(ans.get(ans.size() - 1)[1], R);
            }

        }

        return ans.toArray(new int[ans.size()][]); // need to be specific in parameters: new int[ans.size()][]
                                                   // because `ans` is an Object not an array
    }

    public static void main(String[] args) {
        int[][] intevals1 = new int[][] { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
        int[][] res1 = merge(intevals1);
        System.out.println(res1[1][1]);

        System.out.println("=======");

        int[][] intevals2 = new int[][] { { 1, 4 }, { 4, 5 } };
        int[][] res2 = merge(intevals2);
        System.out.println(res2[0][0]);
    }
}

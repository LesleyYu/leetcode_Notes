package com.Lesley_lc.Algorithms.BFS;

import java.util.ArrayDeque;
import java.util.Queue;

// 994. Rooten Oranges
// BFS
// 回溯

// TS 99.63%; SC 65.19% 优于官方解答：
// SC: 不用存每个点的 depth，只需要一个int来记录 time 过去了多久

public class ex994 {

    public static int orangesRotting(int[][] grid) {
        int rows = grid.length, cols = grid[0].length;
        int[][] dirs = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };

        Queue<Integer> rottens = new ArrayDeque<>();

        int cntAllFresh = 0;
        // find and store all the INITIALLY rotten oranges
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (grid[row][col] == 2) {
                    rottens.add(cols * row + col);
                }
                if (grid[row][col] == 1) {
                    cntAllFresh++;
                }
            }
        }
        // System.out.println("cntAllFresh =" + cntAllFresh);

        int loops = -1; // time elapsed
        int cntAllRottens = -rottens.size();

        // loop while
        // newly rotten oranges still appear in last loop
        // old rotten oranges are removed from the 'rotten' queue
        // because it is no longer useful
        while (!rottens.isEmpty()) {
            loops++;
            // loop through all rotten oranges in the current time
            int num = rottens.size();
            cntAllRottens += num;
            System.out.println("cntAllRottens +=" + num);
            for (int i = 0; i < num; i++) {
                // get a rotten orange
                int index = rottens.poll();
                int col = index % cols, row = index / cols;

                // loop through its 4 neighbors to get new rotten oranges
                for (int[] d : dirs) {
                    int rown = row + d[0], coln = col + d[1];
                    // check boundary
                    if (coln >= 0 && coln < cols && rown >= 0 && rown < rows) {
                        if (grid[rown][coln] == 1) {
                            grid[rown][coln] = 2; // rot
                            rottens.add(rown * cols + coln);
                        }
                    }
                }
            }
        }

        // System.out.println("cntAllRottens =" + cntAllRottens);
        if (cntAllFresh != cntAllRottens)
            return -1;

        return loops == -1 ? 0 : loops;
    }

    public static void main(String[] args) {
        System.out.println(orangesRotting(new int[][] { { 0 } }));
    }
}

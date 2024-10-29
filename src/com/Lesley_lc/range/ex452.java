package com.Lesley_lc.range;

import java.util.Arrays;
import java.util.Comparator;

// 452. Minimum Number of Arrows to Burst Balloons

public class ex452 {

    static public int findMinArrowShots(int[][] points) {
        int n = points.length;
        if (n == 1)
            return 1;

        Arrays.sort(points, new Comparator<int[]>() {
            public int compare(int[] points1, int[] points2) {
                return points1[0] - points2[0];
            }
        });

        int cnt = 0, R = 0;

        for (int i = 0; i < n - 1; i++) {
            R = points[i][1];
            System.out.println("HI: " + R);
            while (R >= points[i + 1][0] && i < n - 2) {
                System.out.println("---------");
                System.out.println("shot at x = " + R);
                System.out.println("before i = " + i);
                i++;
                System.out.println("after i = " + i);
            }
            cnt++;
        }

        if (R < points[n - 1][0]) {
            cnt++;
            System.out.println("shot at x = " + points[n - 1][0]);
        }

        return cnt;
    }

    public static void main(String[] args) {
        // int[][] points1 = { { 10, 16 }, { 2, 8 }, { 1, 6 }, { 7, 12 } };
        // System.err.println(findMinArrowShots(points1));

        // int[][] points2 = { { 10, 16 }, { 2, 8 }, { 1, 6 }, { 7, 12 }, { 33, 34 } };
        // System.err.println(findMinArrowShots(points2) + "\n"); // 3

        // int[][] points3 = { { 1, 2 }, { 2, 3 }, { 3, 4 }, { 4, 5 } };
        // System.out.println(findMinArrowShots(points3) + "\n"); // 2

        // int[][] points6 = { { 1, 2 }, { 3, 4 }, { 5, 6 }, { 7, 8 } };
        // System.out.println(findMinArrowShots(points6) + "\n"); // 4

        // int[][] points4 = { { 1, 2 } };
        // System.out.println(findMinArrowShots(points4) + "\n");

        // int[][] points5 = { { -1, 1 }, { 0, 1 }, { 2, 3 }, { 1, 2 } };
        // System.out.println(findMinArrowShots(points5) + "\n"); // 2

        int[][] points7 = { { -2147483646, -2147483645 }, { 2147483646, 2147483647 } };
        System.out.println(findMinArrowShots(points7) + "\n"); // 2
        // WRONG
    }
}

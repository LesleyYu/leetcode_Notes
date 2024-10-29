package com.Lesley_lc.Matrix;

import java.util.ArrayList;
import java.util.List;

// 54. 螺旋矩阵

public class ex54_2 {
    public static List<Integer> spiralOrder(int[][] matrix) {
        // System.out.println(matrix[0][1]);
        int width = matrix.length;
        int length = matrix[0].length;
        int size = width * length;
        int dir = 0;
        int[][] dir_code = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } }; // [row, col]
        List<Integer> ans = new ArrayList<>();

        int row = 0, col = 0, hor_cnt = 0, ver_cnt = 0;
        for (int i = 0; i < size; i++) {
            // System.out.println("\ni = " + i);

            // System.out.println("index = [" + row + "]" + "[" + col + "]");
            ans.add(matrix[row][col]);

            // 前进计数
            hor_cnt += (dir_code[dir][1] == 0 ? 0 : 1);
            ver_cnt += (dir_code[dir][0] == 0 ? 0 : 1);

            // System.out.println("hor_cnt = " + hor_cnt + "; width = " + width);
            // System.out.println("ver_cnt = " + ver_cnt + "; length = " + length);
            // System.out.println("dir before = " + dir);
            // 更新 下次的 方向
            if (hor_cnt == length) {
                dir = (dir + 1) % 4;
                hor_cnt = 0;
                width--;
            }
            if (ver_cnt == width) {
                dir = (dir + 1) % 4;
                ver_cnt = 0;
                length--;
            }
            // System.out.println("dir after = " + dir);

            // 更新 下次的 row 和 col
            row += dir_code[dir][0];
            col += dir_code[dir][1];
        }

        return ans;
    }

    public static void main(String[] args) {
        int[][] matrix1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[][] matrix2 = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };

        System.out.println(spiralOrder(matrix1));
        System.out.println(spiralOrder(matrix2));
    }
}

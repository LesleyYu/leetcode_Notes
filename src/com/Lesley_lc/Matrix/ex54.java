package com.Lesley_lc.Matrix;

import java.util.ArrayList;
import java.util.List;

// 54. 螺旋矩阵

// 有 bug。 不能用 up down left right 来判定是否触及边界而改变位置。 因为边界的更新 快于 下一次开始
// 应该用 width 和 length。

public class ex54 {
    public static List<Integer> spiralOrder(int[][] matrix) {
        // System.out.println(matrix[0][1]);
        int up = 0, left = -1;
        int right = matrix.length;
        int down = matrix[0].length;
        int size = right * down;
        int dir = 3;
        int[][] dir_code = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } }; // [row, col]
        List<Integer> ans = new ArrayList<>();

        int row = 0, col = 0;
        right--;
        down--;
        for (int i = 0; i < size; i++) {
            System.out.println("\ni = " + i);

            System.out.println("index = [" + row + "]" + "[" + col + "]");
            ans.add(matrix[row][col]);

            System.out.println("row = " + row + "; left = " + left + "; right = " + right);
            System.out.println("col = " + col + "; up = " + up + "; down = " + down);
            if (dir % 2 == 0 && (col == right || col == left)) {
                System.out.println("change direction from horizontal to vertical");
                dir = (dir + 1) % 4;
                if (col == right)
                    up++;
                else
                    down--;
            } else if (dir % 2 == 1 && (row == up || row == down)) {
                System.out.println("change direction from vertical to horizontal");
                System.out.println("dir_before = " + dir);
                dir = (dir + 1) % 4;
                System.out.println("dir_after = " + dir);
                if (row == up)
                    left++;
                else
                    right--;
            }
            // System.out.println("准备加了的 dir = " + dir);
            row += dir_code[dir][0];
            col += dir_code[dir][1];
        }

        return ans;
    }

    public static void main(String[] args) {
        int[][] matrix1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        System.out.println(spiralOrder(matrix1));
    }
}

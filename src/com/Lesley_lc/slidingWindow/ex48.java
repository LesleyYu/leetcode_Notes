package com.Lesley_lc.slidingWindow;

public class ex48 {
    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        // int [][] ans = new int[n][n];

        for (int row = 0; row < n / 2; row++) {
            for (int col = 0; col < (n + 1) / 2; col++) { // col < (n + 1) / 2 而不是 col < n / 2。 这样能直接把后面注释掉的那段全部忽略
                // 循环4次
                int last_item = matrix[row][col];
                for (int cnt = 0; cnt < 4; cnt++) {
                    // 计算目标位置
                    int target_row = col, target_col = (n - 1) - row;
                    int temp = matrix[target_row][target_col];
                    matrix[target_row][target_col] = last_item;
                    last_item = temp;
                    row = target_row;
                    col = target_col;
                }
            }
        }

        // 下面这段不用了。

        // // 如果是 奇数 n x n 的 matrix
        // if (n % 2 == 1) {
        // // 最中间的这一列 / 行 得单独考虑，因为只能旋转一次，不然就重复旋转了
        // int row = (n - 1) / 2, col = 0;
        // for (; col < (n - 1) / 2; col++) {
        // System.out.println("row = " + row);
        // System.out.println("col = " + col);
        // int last_item = matrix[row][col];

        // for (int four = 0; four < 4; four++) {
        // // 计算目标位置
        // int target_row = col, target_col = (n - 1) - row;
        // int temp = matrix[target_row][target_col];
        // matrix[target_row][target_col] = last_item;
        // last_item = temp;
        // row = target_row;
        // col = target_col;
        // System.out.println("matrix[" + row + "][" + col + "] = " + matrix[row][col]);
        // }
        // }

        // }

    }

    public static void main(String[] args) {
        int[][] matrix1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        rotate(matrix1);
        System.out.println(matrix1);

        int[][] matrix2 = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 },
                { 21, 22, 23, 24, 25 } };
        rotate(matrix2);
        System.out.println(matrix2);
    }
}

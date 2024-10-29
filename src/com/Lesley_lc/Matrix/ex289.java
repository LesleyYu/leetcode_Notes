package com.Lesley_lc.Matrix;

import java.util.Arrays;

// 73. 生命游戏

public class ex289 {
    public static void gameOfLife(int[][] board) {
        int row_num = board.length, col_num = board[0].length;
        int[] cols = new int[col_num];
        int[] rows = new int[row_num];

    }

    public static void main(String[] args) {
        int[][] board = new int[][] { { 0, 1, 0 }, { 0, 0, 1 }, { 1, 1, 1 }, { 0, 0, 0 } };
        gameOfLife(board);
        printMatrix(board);

        System.out.println("==============");

        int[][] matrix2 = new int[][] { { 1, 1 }, { 1, 0 } };
        gameOfLife(matrix2);
        printMatrix(matrix2);
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            // for (int j = 0; j < matrix[0].length; j++) {
            System.out.println(Arrays.toString(matrix[i]));
            // }
        }
    }
}

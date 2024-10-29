package com.Lesley_lc.Matrix;

import java.util.Arrays;

// 73. 矩阵置零

public class ex73 {
    public static void setZeroes(int[][] matrix) {
        int row_num = matrix.length, col_num = matrix[0].length;
        int[] cols = new int[col_num];
        int[] rows = new int[row_num];

        // find zeros in original rows
        for (int i = 0; i < row_num; i++) { // outer loop for rows
            for (int j = 0; j < col_num; j++) { // inner loop for cols
                if (matrix[i][j] == 0) {
                    rows[i] = 1;
                    cols[j] = 1;
                }
            }
        }

        // change to zeros
        for (int i = 0; i < row_num; i++) {
            for (int j = 0; j < col_num; j++) {
                if (rows[i] == 1 || cols[j] == 1)
                    matrix[i][j] = 0;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][] { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
        setZeroes(matrix);
        printMatrix(matrix);

        System.out.println("==============");

        int[][] matrix2 = new int[][] { { 0, 1, 2, 0 }, { 3, 4, 5, 2 }, { 1, 3, 1, 5 } };
        setZeroes(matrix2);
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

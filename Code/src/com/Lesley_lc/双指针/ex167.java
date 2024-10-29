package com.Lesley_lc.双指针;

public class ex167 {
    public static int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        System.out.println("n = " + n);

        for (int i = 0, j = n - 1; i < j;) {
            int sum = numbers[i] + numbers[j];
            if (sum == target)
                return new int[] { i + 1, j + 1 };
            if (sum > target) {
                j--;
                System.out.println("j = " + j);
            } else {

                i++;
                System.out.println("i = " + i);
            }
        }

        return new int[] { 9, 99 };
    }

    public static void main(String[] args) {
        // int[] numbers1 = { 2, 7, 11, 15 };
        // int target1 = 9;
        // int[] ans1 = twoSum(numbers1, target1);

        // int[] numbers2 = { 2, 3, 4 };
        // int target2 = 6;
        // int[] ans2 = twoSum(numbers2, target2);

        // int[] numbers3 = { -1, 0 };
        // int target3 = -1;
        // int[] ans3 = twoSum(numbers3, target3);

        int[] numbers4 = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
                -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
                -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
                -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
                -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
                -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
                -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
                -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 1, 1 };
        int target4 = 2;
        int[] ans4 = twoSum(numbers4, target4);

        // System.out.println(ans1[0] + ", " + ans1[1]);
        // System.out.println(ans2[0] + ", " + ans2[1]);
        // System.out.println(ans3[0] + ", " + ans3[1]);
        System.out.println(ans4[0] + ", " + ans4[1]);
    }
}

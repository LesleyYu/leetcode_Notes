package com.Lesley_lc.Strings;

// 自己写的方法一
// 用下标直接循环
// 有bug

public class ex6 {
    public static String convert(String s, int numRows) {
        int n_per_group = 2 * numRows - 2;
        System.out.println("number in a group = " + n_per_group);
        int n = s.length();
        int leftovers = n % n_per_group;
        System.out.println("leftovers = " + leftovers);
        StringBuffer ans = new StringBuffer();

        int groups = n / n_per_group;
        for (int i = 0; i < numRows; i++) {
            if (i == leftovers)
                groups--;
            System.out.println("groups = " + groups);
            for (int j = 0; j <= groups; j++) {
                System.out.println("j = " + j);
                System.out.println("#" + (j * n_per_group + i));
                ans.append(s.charAt(j * n_per_group + i));
                if (i > 0 && i < numRows) {
                    ans.append(s.charAt(j * n_per_group + n_per_group - i));
                    // error: 最后一组的第二个数字会溢出
                    System.out.println("#" + (j * n_per_group + n_per_group - i));
                }
            }
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        String s1 = "PAYPALISHIRING";

        System.out.println(convert(s1, 3));
        // System.out.println(convert(s1, 4));
    }
}

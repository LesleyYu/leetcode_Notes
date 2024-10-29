package com.Lesley_lc.Strings;

// 方法一
// index = 0 直接存
// 然后从 index = 1 开始遍历
// 要是 i 对应的值 比 i-1对应的值 大，
// 就减去刚存的值（i-1对应的值），再加上 i和i-1 对应的值
// 和官方题解几乎一样
// 区别：数据结构储存方式不同

public class ex13 {
    public static int romanToInt(String s) {
        int n = s.length();
        String seqC = "IVXLCDM";
        int[] seqI = { 1, 5, 10, 50, 100, 500, 1000 };

        int[] num = new int[n];
        num[0] = seqI[seqC.indexOf(s.charAt(0))];

        int sum = num[0];
        for (int i = 1; i < n; i++) {
            num[i] = seqI[seqC.indexOf(s.charAt(i))];
            if (num[i] > num[i - 1]) {
                sum = sum - 2 * num[i - 1] + num[i];
            } else {
                sum += num[i];
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        String s1 = "III";
        String s2 = "IV";
        String s3 = "IX";
        String s4 = "LVIII";
        String s5 = "MCMXCIV";

        System.out.println(romanToInt(s1)); // 3
        System.out.println(romanToInt(s2)); // 4
        System.out.println(romanToInt(s3)); // 9
        System.out.println(romanToInt(s4)); // 58
        System.out.println(romanToInt(s5)); // 1994
    }
}

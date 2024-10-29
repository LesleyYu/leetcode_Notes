package com.Lesley_lc.Strings;

// 官方题解一。
// 没能想到。还有bug。我是傻逼。
public class ex12_2 {
    static int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
    static String[] symbols = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

    public static String intToRoman(int num) {
        String ans = new String(); // String vs. StringBuffer！
        // StringBuffer ans = new StringBuffer();
        for (int i = 0; i < values.length; i++) {
            int value = values[i];
            String symbol = symbols[i];
            while (num >= value) {
                ans = ans.concat(symbol);
                // ans.append(symbol);
                num -= value;
            }
            if (num == 0)
                break;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(intToRoman(1994));
    }
}

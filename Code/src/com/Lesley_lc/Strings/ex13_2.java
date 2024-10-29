package com.Lesley_lc.Strings;

import java.util.HashMap;
import java.util.Map;

// 官方题解

public class ex13_2 {
    public static int romanToInt(String s) {
        int n = s.length();
        int sum = 0;
        Map<Character, Integer> romanToVal = new HashMap<Character, Integer>() {
            {
                put('I', 1);
                put('V', 5);
                put('X', 10);
                put('L', 50);
                put('C', 100);
                put('D', 500);
                put('M', 1000);
            }
        };

        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = romanToVal.get(s.charAt(i));
            if (i < n - 1 && num[i] < romanToVal.get(s.charAt(i + 1))) {
                sum -= num[i];
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

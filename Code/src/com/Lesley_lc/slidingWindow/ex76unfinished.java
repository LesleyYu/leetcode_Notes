package com.Lesley_lc.slidingWindow;

import java.util.HashMap;
import java.util.Map;

// 76. 最小覆盖子串

public class ex76 {
    public static String minWindow(String s, String t) {
        int ns = s.length();
        int nt = t.length();
        Map<Character, Integer> ans = new HashMap<>();

        for (int l = 0; l < ns - nt; l++) {
            int r = l + 1;

        }

        return t;
    }

    public static void main(String[] args) {
        String s1 = "ADOBECODEBANC";
        String t1 = "ABC";

        String s2 = "a";
        String t2 = "a";

    }
}

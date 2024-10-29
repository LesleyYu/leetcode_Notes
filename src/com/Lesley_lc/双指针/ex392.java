package com.Lesley_lc.双指针;

public class ex392 {
    public static boolean isSubsequence(String s, String t) {
        int slen = s.length();
        int tlen = t.length();
        if (slen == 0)
            return true;
        if (tlen == 0)
            return false;

        int cur_i = 0;
        char cur_c = s.charAt(cur_i);
        for (int i = 0; i < tlen; i++) {
            if (t.charAt(i) == cur_c) {
                if (cur_i == slen - 1)
                    return true;
                cur_c = s.charAt(++cur_i);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String s1 = "abc";
        String t1 = "ahbgdc";

        String s2 = "axc";

        System.out.println(isSubsequence(s1, t1));
        System.out.println(isSubsequence(s2, t1));
    }
}

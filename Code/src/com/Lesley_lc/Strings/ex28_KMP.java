package com.Lesley_lc.Strings;

public class ex28_KMP {
    public static int strStr(String haystack, String needle) {
        int n_haystack = haystack.length();
        int n_needle = needle.length();

        return -1;
    }

    public static void main(String[] args) {
        String haystack1 = "adbutsad";
        String needle1 = "sad";

        System.out.println(strStr(haystack1, needle1));
    }
}

package com.Lesley_lc.Strings;

public class ex28 {
    public static int strStr(String haystack, String needle) {
        int n_haystack = haystack.length();
        int n_needle = needle.length();

        outer: for (int i = 0; i < n_haystack - n_needle + 1; i++) {
            // int step = n_needle-1;
            if (haystack.charAt(i) == needle.charAt(0)) {
                for (int j = 0; j < n_needle; j++) {
                    // if (haystack.charAt(i + j) == needle.charAt(0)) {
                    // step = j-1;
                    // }
                    if (haystack.charAt(i + j) != needle.charAt(j))
                        continue outer;
                }
                // if (haystack.substring(i, i + n_needle).equals(needle)) {
                // // System.out.println("hi");
                // return i;
                // }
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String haystack1 = "adbutsad";
        String needle1 = "sad";

        System.out.println(strStr(haystack1, needle1));
    }
}

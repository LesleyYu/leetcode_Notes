package com.Lesley_lc.Strings;

public class ex14 {

    public static String longestCommonPrefix(String[] strs) {
        int count = strs.length;
        if (strs[0] == "") {
            return "";
        }

        // StringBuffer ans = new StringBuffer();
        int i = 0;
        outer: for (; i < strs[0].length(); i++) {
            char cur = strs[0].charAt(i);
            for (int j = 1; j < count; j++) {
                if (strs[j].length() - 1 < i || strs[j].charAt(i) != cur)
                    break outer;
            }
            // ans.append(Character.toString(cur));
        }

        return strs[0].substring(0, i);
    }

    public static void main(String[] args) {
        String[] strs1 = { "flower", "flow", "flight" };
        String[] strs3 = { "flower", "fl", "flight" };
        String[] strs2 = { "dog", "racecar", "car" };

        System.out.println(longestCommonPrefix(strs1));
        System.out.println(longestCommonPrefix(strs2));
        System.out.println(longestCommonPrefix(strs3));
    }

}

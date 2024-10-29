package com.Lesley_lc.Strings;

public class ex58 {
    public static int lengthOfLastWord(String s) {
        s = s.strip();

        int n = s.length();
        int i = n - 1;
        for (; i >= 0; i--) {
            int asc = (int) s.charAt(i);
            if (asc < 65 || asc > 122 || (asc > 90 && asc < 97))
                break;
        }
        return (n - i - 1);
    }

    public static void main(String[] args) {
        String s1 = "   fly me   to   the moon  ";
        String s2 = "luffy is still joyboy";

        System.out.println(lengthOfLastWord(s1));
        System.out.println(lengthOfLastWord(s2));
    }
}

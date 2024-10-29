package com.Lesley_lc.双指针;

// 125. 验证回文串

// 使用 Java 的 toLowerCase 和 Character.isLetterOrDigit 优化

public class ex125_2 {
    public static boolean isPalindrome(String s) {
        int n = s.length();
        if (n <= 1)
            return true;

        int i = 0, j = n - 1;
        while (i < j) {
            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }
            while (i < j && !Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            }

            if (i < j) {
                if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                    return false;
                }
                i++;
                j--;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s1 = "A man, a plan, a canal: Panama";
        String s2 = "0P";

        System.out.println(isPalindrome(s1));
        System.out.println(isPalindrome(s2));
    }
}

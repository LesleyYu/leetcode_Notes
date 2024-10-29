package com.Lesley_lc.双指针;

// 125. 验证回文串

// 思路和官方题解一样，但是时间复杂度比大部分人高
// 可以使用 Java 的 toLowerCase 和 Character.isLetterOrDigit 优化
// 优化后见 ex125_2.java
public class ex125 {
    public static boolean isPalindrome(String s) {
        int n = s.length();
        if (n <= 1)
            return true;

        int i = 0, j = n - 1;
        while (i < j) {
            int ci = (int) s.charAt(i), cj = (int) s.charAt(j);
            System.out.println("i = " + i + "; ci = " + ci);
            if ((ci < 48) || (ci > 57 && ci < 65) || (ci > 90 && ci < 97) || (ci > 122)) {
                i++;
                continue;
            }
            if ((cj < 48) || (cj > 57 && cj < 65) || (cj > 90 && cj < 97) || (cj > 122)) {
                j--;
                continue;
            }
            if (ci >= 97)
                ci -= (97 - 65);
            if (cj >= 97)
                cj -= (97 - 65);
            if (ci != cj) {
                System.out.println(ci + "hiiiiiii " + s.charAt(i) + "; " + cj + " hiiii " + s.charAt(j));
                return false;
            }
            i++;
            j--;
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

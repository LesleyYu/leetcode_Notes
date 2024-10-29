package com.Lesley_lc.Strings;

public class ex151 {
    public static String reverseWords(String s) {
        s = s.strip();
        int n = s.length();
        StringBuilder ans = new StringBuilder();
        StringBuffer temp = new StringBuffer();

        for (int i = 0; i < n; i++) {
            int asc = (int) s.charAt(i);
            // if ((asc >= 0 && asc <= 9) || (asc >= 65 && asc <= 90) || (asc >= 97 && asc
            // <= 122)) {
            if (asc != 32) {
                // System.out.println(temp);
                temp.append((char) asc);
            } else if (asc == 32) {
                ans.insert(0, temp);
                temp.delete(0, temp.length());
                while (true) {
                    asc = (int) s.charAt(i);
                    if (asc != 32) {
                        ans.insert(0, " ");
                        i--;
                        break;
                    }
                    i++;
                }
            }

        }
        ans.insert(0, temp);
        return ans.toString();
    }

    public static void main(String[] args) {
        String s1 = "the sky is blue";

        System.out.println("\n\n");
        System.out.println(reverseWords(s1));
    }
}

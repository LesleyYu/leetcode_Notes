package com.Lesley_lc.HashTable;

public class ex242 {

    public static boolean isAnagram(String s, String t) {
        int slen = s.length(), tlen = t.length();
        if (slen != tlen)
            return false;

        int[] hash = new int[26];

        // loop through s, add to each letter
        for (int i = 0; i < slen; i++) {
            char x = s.charAt(i);
            hash[x - 'a']++;
        }

        for (int i = 0; i < slen; i++) {
            char x = t.charAt(i);
            // System.out.println(x);
            hash[x - 'a']--;
            if (hash[x - 'a'] < 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String s1 = "anagram", t1 = "nagaram";
        System.out.println(isAnagram(s1, t1));

        String s2 = "rat", t2 = "car";
        System.out.println(isAnagram(s2, t2));

        String s3 = "zlap", t3 = "kcqx";
        System.out.println(isAnagram(s3, t3));
    }
}

package com.Lesley_lc.HashTable;

import java.util.HashMap;
import java.util.Map;

public class ex205 {
    public static boolean isIsomorphic(String s, String t) {
        int len = s.length();
        // if (slen != tlen) return false;

        Map<Character, Character> s2t = new HashMap<Character, Character>();
        Map<Character, Character> t2s = new HashMap<Character, Character>();
        for (int i = 0; i < len; i++) {
            char x = s.charAt(i), y = t.charAt(i);
            if (s2t.containsKey(x) && s2t.get(x) != y || (t2s.containsKey(y) && t2s.get(y) != x)) {
                return false;
            }
            s2t.put(x, y);
            t2s.put(y, x);
        }

        // System.out.println("Hash table: " + ht);
        return true;
    }

    public static void main(String[] args) {

        String s3 = "paper";
        String t3 = "title";
        System.out.println(isIsomorphic(s3, t3));
    }
}

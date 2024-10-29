package com.Lesley_lc.HashTable;

import java.util.HashMap;
import java.util.Map;

public class ex290 {
    public static boolean wordPattern(String pattern, String s) {
        String[] ss = s.split(" ");
        int slen = ss.length, plen = pattern.length();
        if (slen != plen)
            return false;

        // System.out.println(ss[3]);
        // System.out.println("====");

        Map<Character, String> p2s = new HashMap<>();
        Map<String, Character> s2p = new HashMap<>();
        for (int i = 0; i < slen; i++) {
            char x = pattern.charAt(i);
            // System.out.println(x);
            String y = ss[i];
            // System.out.println(y);
            // System.out.println("=====");
            if ((p2s.containsKey(x) && !p2s.get(x).equals(y)) || (s2p.containsKey(y) && s2p.get(y) != x)) {
                // if (p2s.containsKey(x) && !p2s.get(x).equals(y))
                // System.out.println("hi " + p2s.get(x) + y);
                return false;
            }
            p2s.put(x, y);
            s2p.put(y, x);
        }

        return true;
    }

    public static void main(String[] args) {
        String pattern = "abba", s = "dog cat cat dog";
        System.out.println(wordPattern(pattern, s));
    }
}

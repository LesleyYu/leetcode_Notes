package com.Lesley_lc.Stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

// 71. Simplify Path

// Deque

public class ex71_2 {

    public static String simplifyPath(String path) {
        // System.out.println("===========");

        String[] dirs = path.split("/");
        int n = dirs.length;
        Deque<String> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            String cur = dirs[i];
            // System.out.println(cur);
            if (cur.isEmpty() || cur.equals(".")) {
                continue;
            }
            if (cur.equals("..")) {
                if (stack.peek() != null) {
                    stack.pollLast();
                }
            } else {
                stack.offerLast(cur);
            }
        }

        if (stack.peek() == null)
            return "/";

        StringBuffer ans = new StringBuffer();
        int nstack = stack.size();
        for (int i = 0; i < nstack; i++) {
            ans.append("/");
            ans.append(stack.pollFirst());
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String path1 = "/home/";
        System.out.println(simplifyPath(path1));

        String path2 = "/home//foo/";
        System.out.println(simplifyPath(path2));

        String path3 = "/home/user/Documents/../Pictures";
        System.out.println(simplifyPath(path3));

        String path4 = "/../";
        System.out.println(simplifyPath(path4));

        String path5 = "/.../a/../b/c/../d/./";
        System.out.println(simplifyPath(path5));

    }
}

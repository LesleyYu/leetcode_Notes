package com.Lesley_lc.Stack;

import java.util.Stack;

// 71. Simplify Path

// 问题太多了 // 废弃

public class ex71 {

    public static String simplifyPath(String path) {
        // System.out.println("===========");
        int n = path.length();

        char[] cpath = path.toCharArray();
        StringBuffer cur = new StringBuffer();
        Stack<String> stack = new Stack<String>();

        // start from the 2nd char because 1st one is "/"
        for (int i = 1; i < n; i++) {
            // System.out.println("cpath[i] = " + cpath[i]);
            if (cpath[i] == '/') {
                if (cur.isEmpty() || cur.toString().equals(".")) {
                    continue;
                } else if (cur.toString().equals("..")) {
                    if (!stack.empty()) {
                        stack.pop();
                    }
                } else {
                    // System.out.println("cur: " + cur.toString());
                    stack.push(cur.toString());
                }
                cur.delete(0, cur.length());
            } else if (i == n - 1) {
                cur.append(cpath[i]);
                stack.push(cur.toString());
            } else {
                cur.append(cpath[i]);
            }
        }

        // System.out.println("stack: " + stack);
        int nstack = stack.size();

        Stack<String> revStack = new Stack<String>();
        for (int i = 0; i < nstack; i++) {
            revStack.push(stack.pop());
        }
        // System.out.println("revStack: " + revStack);

        StringBuffer ans = new StringBuffer();
        for (int i = 0; i < nstack; i++) {
            ans.append('/');
            ans.append(revStack.pop());
        }

        if (nstack == 0) {
            return "/";
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        // String path1 = "/home/";
        // System.out.println(simplifyPath(path1));

        // String path2 = "/home//foo/";
        // System.out.println(simplifyPath(path2));

        String path3 = "/home/user/Documents/../Pictures";
        System.out.println(simplifyPath(path3));

        // String path4 = "/../";
        // System.out.println(simplifyPath(path4));

        // String path5 = "/.../a/../b/c/../d/./";
        // System.out.println(simplifyPath(path5));

        // StringBuffer cur = new StringBuffer();
        // cur.append('.');
        // cur.append('.');
        // System.out.println(cur.toString() == "..");
    }
}

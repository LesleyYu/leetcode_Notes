package com.Lesley_lc.Stack;

import java.util.Stack;

// 20. Valid Parentheses

// String.contains() which checks if the string contains a specified sequence of char values
// String.indexOf() which returns the index within the string of the first occurence of the specified character or substring (there are 4 variations of this method)

// Print out the type of a variable:
// System.out.println(chars.getClass().getSimpleName());

public class ex20 {
    public static boolean isValid(String s) {
        int n = s.length();
        if (n % 2 == 1)
            return false;

        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        // System.out.println("inital stack : " + stack);

        for (int i = 0; i < n; i++) {
            char temp = chars[i];
            // System.out.println("current char: " + chars[i]);
            if ("([{".indexOf(temp) != -1) { // if left parenthesis, push
                stack.push(temp);
                // System.out.println("stack pushed, now it's : " + stack);
            } else { // if right parenthesis, try pop
                if (stack.isEmpty()) { // if empty, cannot pop, false
                    return false;
                }
                // if not empty, pop and check
                else if ((temp == ']' && stack.pop() != '[') ||
                        (temp == ')' && stack.pop() != '(') ||
                        (temp == '}' && stack.pop() != '{')) {
                    // continue;
                    return false;
                }
            }
        }

        if (!stack.empty())
            return false;

        return true;
    }

    public static void main(String[] args) {
        System.out.println("===========");
        String s1 = "((";
        System.out.println(s1 + isValid(s1));

        System.out.println("\n===========");
        String s2 = "()[]{}";
        System.out.println(s2 + isValid(s2));

        System.out.println("\n===========");
        String s3 = "(]";
        System.out.println(s3 + isValid(s3));

        System.out.println("\n===========");
        String s4 = "[({]})";
        System.out.println(s4 + isValid(s4));
    }
}

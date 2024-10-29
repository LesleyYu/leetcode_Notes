package com.Lesley_lc.Stack;

import java.util.ArrayDeque;
import java.util.Deque;

// 150. Evaluate Reverse Polish Notation

public class ex150 {
    public static int evalRPN(String[] tokens) {
        // System.out.println("===============");
        int n = tokens.length;
        if (n <= 1)
            return Integer.parseInt(tokens[0]);

        Deque<String> num = new ArrayDeque<String>();

        for (int i = 0; i < n; i++) {
            if ("+-*/".contains(tokens[i])) {
                // System.out.println("+-*/ : " + tokens[i]);
                int left = 0, right = 0;
                Integer result = 0;
                if (num.peekFirst() != null) {
                    right = Integer.parseInt(num.pollLast());
                    left = Integer.parseInt(num.pollLast());
                    if (tokens[i].equals("+")) {
                        result = left + right;
                    } else if (tokens[i].equals("-")) {
                        result = left - right;
                    } else if (tokens[i].equals("*")) {
                        result = left * right;
                    } else {
                        result = left / right;
                        // System.out.println(left + " / " + right + " = " + result);
                    }
                }
                // System.out.println("result = " + result);
                num.add(result.toString());
            } else {
                // System.out.println("add num: " + tokens[i]);
                num.add(tokens[i]);
            }
        }

        return Integer.parseInt(num.peekFirst());
    }

    public static void main(String[] args) {

        String[] tokens1 = { "2", "1", "+", "3", "*" };
        System.out.println(evalRPN(tokens1));

        String[] tokens2 = { "4", "13", "5", "/", "+" };
        System.out.println(evalRPN(tokens2));

        String[] tokens3 = { "10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+" };
        System.out.println(evalRPN(tokens3));

    }
}

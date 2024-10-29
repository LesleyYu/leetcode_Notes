package com.Lesley_lc.Stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

// 224. Basic Calculator

// 一团遭的办法。。。

public class ex224 {
    public static int calculate(String s) {
        int n = s.length();
        Deque<Character> operators = new ArrayDeque<>();
        operators.add('+');
        Stack<Boolean> invertSign = new Stack<>();
        invertSign.add(false);
        Deque<Integer> nums = new ArrayDeque<>();
        int cnt_digit = 0;

        for (int i = 0; i < n; i++) {
            char cur = s.charAt(i);
            if (cur == ' ') {
                continue;
            }
            if ("0123456789".contains(s.substring(i, i + 1))) {
                cnt_digit += 1;
            } else {
                System.out.println("cur is : " + cur);
                if (cnt_digit > 0) {
                    int curNum = Integer.parseInt(s.substring(i - cnt_digit, i));
                    System.out.println(curNum);
                    nums.add(curNum);
                    cnt_digit = 0;
                }
                if (cur == '+') {
                    if (invertSign.peek() == false) {
                        System.out.println("operators.add('+')");
                        operators.add('+');
                    } else {
                        System.out.println("operators.add('-')");
                        operators.add('-');
                    }
                } else if (cur == '-') {
                    System.out.println("cur == '-'");
                    if (invertSign.peek() == true) {
                        System.out.println("operators.add('+')");
                        operators.add('+');
                    } else {
                        System.out.println("operators.add('-')");
                        operators.add('-');
                    }
                } else if (cur == '(') {
                    if (operators.peekLast() == '-') {
                        invertSign.add(true);
                    } else {
                        invertSign.add(false);
                    }
                } else if (cur == ')') {
                    invertSign.pop();
                }
            }
        }

        int numsn = nums.size();
        System.out.println("nums size = " + numsn);
        int left = nums.pollFirst(), right = 0;
        operators.pollFirst();
        for (int i = 0; i < numsn - 1; i++) {
            right = nums.pollFirst();
            if (operators.pollFirst() == '+') {
                left = left + right;
            } else {
                left = left - right;
            }
            System.out.println(left);
        }

        System.out.println("-----------");
        return left;
    }

    public static void main(String[] args) {
        String s1 = "1 + 1";
        System.out.println(calculate(s1));

        String s2 = " 2-1 + 2 ";
        System.out.println(calculate(s2));

        String s3 = "(1+(4+5+2) -3)+(6+8)";
        System.out.println(calculate(s3));

        // System.out.println("0, 1: " + "GFD".substring(0, 1));
        // System.out.println("0, 2: " + "GFD".substring(0, 2));
        // System.out.println("0, 3: " + "GFD".substring(0, 3));
        // System.out.println("1, 3: " + "GFD".substring(1, 3));
        // System.out.println("2, 3: " + "GFD".substring(2, 3));
        // System.out.println("3, 3: " + "GFD".substring(3, 3));

    }
}

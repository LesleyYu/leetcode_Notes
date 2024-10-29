package com.Lesley_lc.Strings;

import java.util.ArrayList;
import java.util.List;

// 自己写的方法二
// 储存存到对应下标的变量 rows 里
// 不通过计算 下标i来算 当前的 char 应该被存到哪一组
// 而是 转换 temp对应的下标。

public class ex6_2 {
    public static String convert(String s, int numRows) {
        if (numRows < 2)
            return s;

        // initialize StringBuilder Array List
        List<StringBuilder> rows = new ArrayList<StringBuilder>();
        for (int i = 0; i < numRows; i++)
            rows.add(new StringBuilder());

        // start storing
        int direction = -1, i = 0; // 起始 direction 得是 -1，因为 i = 0 的时候会转换方向
        for (char c : s.toCharArray()) {
            rows.get(i).append(c);
            if (i == 0 || i == numRows - 1)
                direction = -direction; // 反转方向
            i += direction;
        }

        // combine result into a final variable
        StringBuffer ans = new StringBuffer();
        for (StringBuilder row : rows)
            ans.append(row);

        return ans.toString();
    }

    public static void main(String[] args) {
        String s1 = "PAYPALISHIRING";

        System.out.println(convert(s1, 3));
        // System.out.println(convert(s1, 4));
    }
}

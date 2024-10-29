package com.Lesley_lc.Strings;

import java.util.HashMap;
import java.util.Map;

public class ex12 {
    public static String intToRoman(int num) {
        int[] numint = new int[4];
        numint[0] = num / 1000 * 1000;
        numint[1] = num % 1000 / 100 * 100;
        numint[2] = num % 100 / 10 * 10;
        numint[3] = num % 10;
        Map<Integer, String> intToChar = new HashMap<Integer, String>() {
            {
                put(1, "I");
                put(5, "V");
                put(10, "X");
                put(50, "L");
                put(100, "C");
                put(500, "D");
                put(1000, "M");
                put(4, "IV");
                put(9, "IX");
                put(40, "XL");
                put(90, "XC");
                put(400, "CD");
                put(900, "CM");
            }
        };

        String ans = new String();
        for (int i = 0; i < 4; i++) {
            // int cur = numint[i];
            // for (int j = 0; j < 3 - i; j++) {
            //     cur *= 10;
            // }
            // System.out.println(cur);
            int firstDigit = Integer.parseInt(Integer.toString(numint[i]).substring(0, 1));
            if (firstDigit % 5 == 4 || firstDigit % 5 == 0) {
                ans.concat(intToChar.get(numint[i]));
            } else {
                int repeat = firstDigit % 5;
                numsint     // 发现不行。因为不止四个循环。再if else下去就太长了，很烦。重写。
            }

        }

        return "I";
    }

    public static void main(String[] args) {
        intToRoman(1994);
    }
}

package com.lyang.test;

import java.util.HashMap;
import java.util.Map;

public class TestOne {

    public static String multiply(String num1, String num2) {
        int[] levels = new int[num2.length() + num1.length()];
        for(int i = num2.length()-1; i >= 0; --i)
        {
            int digit2 = num2.charAt(i) - '0';
            for(int j = num1.length()-1; j >= 0; --j)
            {
                int digit1 = num1.charAt(j) - '0';
                levels[i+j+1] += digit2 * digit1;
                levels[i+j] += levels[i+j+1] / 10; // move the carry
                levels[i+j+1] %= 10;
            }
        }
        String result = ""; // Could use StringBuilder here
        boolean start = false;
        for(int level : levels)
        {
            if(!start) // skip 0s in the front
            {
                start = level != 0;
                if(!start)
                    continue;
            }
            result += level;
        }
        return result.length() == 0 ? "0" : result;
    }

    public static void main(String[] args) {
        String[] strs = "a.dfa,1|23".split("\\.|,|\\|");
        System.out.println(strs[0]+ "--" +strs[1]+ "--" +strs[2]+ "--" +strs[3]);

        String multiply = multiply("21", "223");
        System.out.println(multiply);

        String s = "dvdf";
        int max = 0;
        String str = "";
        int num = 0;
        for(int i = 0; i < s.length(); i++) {
            int index = str.indexOf(String.valueOf(s.charAt(i)));
            if(index > -1) {
                if(num > max) {
                    max = num;
                }
                i = index + 1;
                str = String.valueOf(s.charAt(i));
                num = 1;
            } else {
                str += s.charAt(i);
                num ++;
            }
            if(num > max) {
                max = num;
            }
        }
        System.out.println(max);
    }
}

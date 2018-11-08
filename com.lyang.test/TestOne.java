package com.lyang.test;

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
        String multiply = multiply("21", "223");
        System.out.println(multiply);
    }
}

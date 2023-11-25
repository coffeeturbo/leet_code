package com.leetcode.easy;

public class Palindrome {
    public boolean isPalindrome(int x) {
        var chars = String.valueOf(x).toCharArray();

        int start = 0;
        int end = chars.length - 1;

        while (start < end) {
            if (chars[start++] != chars[end--]) {
                return false;
            }
        }

        return true;
    }
}

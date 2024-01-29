package com.leetcode.easy;

public class FindTheIndexOfTheFirstOccurrenceInAString {
    public int strStr(String haystack, String needle) {

        if (haystack.isEmpty() || needle.isEmpty() || needle.length() > haystack.length()) {
            return -1;
        }

        for (int i = 0; i < haystack.length(); i++) {
            int j = 0;
            while (haystack.length() - i >= needle.length() && j < needle.length()
                    && haystack.charAt(i + j) == needle.charAt(j)
            ) {
                j++;
            }


            if (j == needle.length()) {
                return i;
            }
        }

        return -1;
    }
}

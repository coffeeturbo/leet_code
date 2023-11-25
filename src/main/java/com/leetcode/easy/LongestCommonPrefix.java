package com.leetcode.easy;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {

        if (strs == null) {
            return "";
        }

        StringBuilder builder = new StringBuilder();
        int index = 0;
        StringBuilder checkPrefix = new StringBuilder();
        while (startWith(strs, checkPrefix.toString())) {
            builder = new StringBuilder(checkPrefix);
            if (index == strs[0].length()) {
                break;
            }
            checkPrefix.append(strs[0].charAt(index++));
        }


        return builder.toString();
    }


    private boolean startWith(String[] words, String prefix) {
        for (var word : words) {
            if (word.isEmpty() || !word.startsWith(prefix)) {
                return false;
            }
        }
        return true;
    }

}

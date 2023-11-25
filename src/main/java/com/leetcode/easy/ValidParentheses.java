package com.leetcode.easy;

import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }

        Stack<Character> stack = new Stack<>();
        Map<Character, Character> brackets = Map.of(
                '(', ')',
                '{', '}',
                '[', ']'
        );

        for (var ch : s.toCharArray()) {

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(brackets.get(ch));
            } else if (stack.isEmpty() || ch != stack.pop()) {

                return false;
            }

        }
        return stack.isEmpty();
    }
}

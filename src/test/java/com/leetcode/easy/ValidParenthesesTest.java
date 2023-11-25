package com.leetcode.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class ValidParenthesesTest {

    private ValidParentheses validParentheses;

    @BeforeEach
    void setUp() {
        validParentheses = new ValidParentheses();
    }

    @Test
    void shouldReturnTrueWhenIsValid() {
        assertThat(validParentheses.isValid("()"))
                .isTrue();
    }

    @Test
    void shouldReturnTrueWhenIsValidSecond() {
        assertThat(validParentheses.isValid("()[]{}"))
                .isTrue();
    }
    @Test
    void shouldReturnTrueWhenIsValidThird() {
        assertThat(validParentheses.isValid("{[]}"))
                .isTrue();
    }

    @Test
    void shouldReturnFalseWhenIsNotValid() {
        assertThat(validParentheses.isValid("(]"))
                .isFalse();
    }

    @Test
    void shouldReturnFalseWhenIsNotValidSecond() {
        assertThat(validParentheses.isValid("([)]"))
                .isFalse();
    }
}
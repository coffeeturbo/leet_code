package com.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class FindTheIndexOfTheFirstOccurrenceInAStringTest {

    private final FindTheIndexOfTheFirstOccurrenceInAString executor = new FindTheIndexOfTheFirstOccurrenceInAString();


    @Test
    void shouldReturnMinusWhenHaystackIsLessThanNeedle() {
        assertThat(executor.strStr("sad", "sadbutsad"))
                .isEqualTo(-1);
    }

    @Test
    void shouldReturnMinusWhenHaystackDoesNotContainNeedle() {
        assertThat(executor.strStr("leetcode", "leeto"))
                .isEqualTo(-1);
    }

    @Test
    void shouldReturnZero() {
        assertThat(executor.strStr("sadbutsad", "sad"))
                .isZero();
    }

    @Test
    void shouldReturnZeroWhenSizeOne() {
        assertThat(executor.strStr("a", "a"))
                .isZero();
    }
}
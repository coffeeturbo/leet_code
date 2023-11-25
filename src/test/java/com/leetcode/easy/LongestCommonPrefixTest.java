package com.leetcode.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LongestCommonPrefixTest {

    private LongestCommonPrefix longestCommonPrefix;

    @BeforeEach
    void setUp() {
        longestCommonPrefix = new LongestCommonPrefix();
    }

    @Test
    void longestCommonPrefix() {

        assertThat(longestCommonPrefix.longestCommonPrefix(new String[]{"flower", "flow", "flight"}))
                .isEqualTo("fl");


    }

    @Test
    void longestCommonPrefixSecond() {

        assertThat(longestCommonPrefix.longestCommonPrefix(new String[]{"dog", "racecar", "car"}))
                .isEmpty();


    }

    @Test
    void longestCommonPrefixThird() {

        assertThat(longestCommonPrefix.longestCommonPrefix(new String[]{"", "racecar", "car"}))
                .isEmpty();


    }

    @Test
    void longestCommonPrefixFours() {

        assertThat(longestCommonPrefix.longestCommonPrefix(new String[]{"a"}))
                .isEqualTo("a");


    }
}
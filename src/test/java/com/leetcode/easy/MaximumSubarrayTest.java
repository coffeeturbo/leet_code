package com.leetcode.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaximumSubarrayTest {

    private MaximumSubarray maximumSubarray;

    @BeforeEach
    void setUp() {
        maximumSubarray = new MaximumSubarray();
    }

    @Test
    void shouldFindMaxSubArray() {
        assertThat(maximumSubarray.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}))
                .isEqualTo(6);
    }

    @Test
    void shouldFindMaxSubArraySecond() {
        assertThat(maximumSubarray.maxSubArray(new int[]{1}))
                .isEqualTo(1);
    }

    @Test
    void shouldFindMaxSubArrayThird() {
        assertThat(maximumSubarray.maxSubArray(new int[]{5, 4, -1, 7, 8}))
                .isEqualTo(23);
    }
}
package com.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class RemoveElementTest {

    private final RemoveElement removeElement = new RemoveElement();

    @Test
    void shouldReturnZeroWhenArraySizeIsZero() {
        assertThat(removeElement.removeElement(new int[0], 0))
                .isZero();
    }

    @Test
    void shouldNotReturnZeroWhenArraySizeIsZero() {
        assertThat(removeElement.removeElement(new int[]{1, 2, 3}, 0))
                .isNotZero();
    }

    @Test
    void shouldReturnResultThree() {
        assertThat(removeElement.removeElement(new int[]{1, 4, 2, 3, 4}, 4))
                .isNotZero();
    }

    @Test
    void shouldReturnWhenPassed() {
        var actual = new int[]{3, 2, 2, 3};
        var expected = new int[]{2, 2};
        var removeVal = 3;

        assertThat(removeElement.removeElement(actual, removeVal))
                .matches(integer -> integer != removeVal)
                .isNotZero()
                .isEqualTo(expected.length);

        shouldAssertTwoArrays(2, actual, expected);

    }

    private void shouldAssertTwoArrays(int expectedSize, int[] actual, int expected[]) {
        for (int i = 0; i < expectedSize; i++) {
            assertThat(expected[i])
                    .isEqualTo(actual[i]);
        }
    }
}
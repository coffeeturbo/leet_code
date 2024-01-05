package com.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RemoveDuplicatesFromSortedArrayTest {

    private final RemoveDuplicatesFromSortedArray processor = new RemoveDuplicatesFromSortedArray();

    @Test
    void removeDuplicates() {
        var expected = 2;
        var inputArray = new int[]{1, 1, 2};
        var expectedArray = new int[]{1, 2, 0};
        int actual = processor.removeDuplicates(inputArray);

        assertThatArrayExpected(expected, inputArray, expectedArray);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFive() {
        var expected = 5;
        var inputArray = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        var expectedArray = new int[]{0, 1, 2, 3, 4, 2, 2, 3, 3, 4};
        int actual = processor.removeDuplicates(inputArray);

        assertThatArrayExpected(expected, inputArray, expectedArray);
        assertThat(actual).isEqualTo(expected);
    }


    private static void assertThatArrayExpected(int expected, int[] inputArray, int[] expectedArray) {
        for (int i = 0; i < expected; i++) {
            assertThat(inputArray[i])
                    .isEqualTo(expectedArray[i]);
        }
    }
}
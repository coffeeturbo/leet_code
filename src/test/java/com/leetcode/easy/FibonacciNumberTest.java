package com.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class FibonacciNumberTest {

    private final FibonacciNumber fibonacciNumber = new FibonacciNumber();

    @Test
    void shouldReturnOneWhenPassingTwo() {
        assertThat(fibonacciNumber.fib(2))
                .isEqualTo(1);
    }
    @Test
    void shouldReturnTreeWhenPassingTree() {
        assertThat(fibonacciNumber.fib(3))
                .isEqualTo(2);
    }

    @Test
    void shouldReturnFourWhenPassingTree() {
        assertThat(fibonacciNumber.fib(4))
                .isEqualTo(3);
    }

}
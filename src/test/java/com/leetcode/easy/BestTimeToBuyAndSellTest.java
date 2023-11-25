package com.leetcode.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BestTimeToBuyAndSellTest {

    private BestTimeToBuyAndSell bestTimeToBuyAndSell;

    @BeforeEach
    void setUp() {
        bestTimeToBuyAndSell = new BestTimeToBuyAndSell();
    }

    @Test
    void shouldReturnProfitFive() {
        assertThat(bestTimeToBuyAndSell.maxProfit(new int[]{7, 1, 5, 3, 6, 4}))
                .isEqualTo(5);
    }

    @Test
    void shouldReturnProfitZero() {
        assertThat(bestTimeToBuyAndSell.maxProfit(new int[]{7, 6, 4, 3, 1}))
                .isZero();
    }
}
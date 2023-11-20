package easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;


class TwoSumTest {

    private TwoSum twoSum;

    @BeforeEach
    void setUp() {
        this.twoSum = new TwoSum();
    }

    @Test
    void shouldReturnSumOfTwo() {

        assertThat(twoSum.twoSum(new int[]{2,7,11,15}, 9))
                .isEqualTo(new int[]{0, 1});

    }

    @Test
    void shouldReturnSumOfTwoCaseTwo() {

        assertThat(twoSum.twoSum(new int[]{3,2,4}, 6))
                .isEqualTo(new int[]{1, 2});


    }

    @Test
    void shouldReturnSumOfTwoCaseThree() {

        assertThat(twoSum.twoSum(new int[]{3,3}, 6))
                .isEqualTo(new int[]{0, 1});


    }
}
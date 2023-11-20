package easy;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PalindromeTest {
    private Palindrome palindrome;

    @BeforeEach
    void setUp() {
        palindrome = new Palindrome();

    }

    @Test
    void shouldReturnTrue() {
        int digit = 121;

        assertThat(palindrome.isPalindrome(digit))
                .isTrue();

    }

    @Test
    void shouldReturnFalse() {
        int digit = -121;

        assertThat(palindrome.isPalindrome(digit))
                .isFalse();

    }


    @Test
    void shouldReturnFalseSecond() {
        int digit = 10;

        assertThat(palindrome.isPalindrome(digit))
                .isFalse();

    }

}
package easy;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class RomanToIntegerTest {
    private RomanToInteger romanToInteger;

    @BeforeEach
    void setUp() {
        romanToInteger = new RomanToInteger();
    }

    @Test
    void shouldReturn3whenIII() {
        Assertions.assertThat(romanToInteger.romanToInt("III"))
                .isEqualTo(3);
    }

    @Test
    void shouldReturn58whenLVIII() {
        Assertions.assertThat(romanToInteger.romanToInt("LVIII"))
                .isEqualTo(58);
    }

    @Test
    void shouldReturn1994whenMCMXCIV() {
        Assertions.assertThat(romanToInteger.romanToInt("MCMXCIV"))
                .isEqualTo(1994);
    }
}
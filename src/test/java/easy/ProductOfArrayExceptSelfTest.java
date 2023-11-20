package easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class ProductOfArrayExceptSelfTest {

    private ProductOfArrayExceptSelf productOfArrayExceptSelf;

    @BeforeEach
    void setUp() {
        productOfArrayExceptSelf = new ProductOfArrayExceptSelf();
    }

    @Test
    void shouldReturnProductExceptSelf() {

        var actual = productOfArrayExceptSelf.productExceptSelf(new int[]{1, 2, 3, 4});
        assertThat(actual)
                .isEqualTo(new int[]{24, 12, 8, 6});
    }


    @Test
    void shouldReturnProductLeft() {

        var actual = productOfArrayExceptSelf.productLeft(new int[]{4,5,1,8,2});
        assertThat(actual)
                .isEqualTo(new int[]{1, 4, 20, 20, 160});
    }

    @Test
    void shouldReturnProductRight() {

        var actual = productOfArrayExceptSelf.productRight(new int[]{4,5,1,8,2});
        assertThat(actual)
                .isEqualTo(new int[]{80, 16, 16, 2, 1});
    }
}
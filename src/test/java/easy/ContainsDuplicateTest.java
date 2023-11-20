package easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class ContainsDuplicateTest {
    private ContainsDuplicate containsDuplicate;

    @BeforeEach
    void setUp() {
        containsDuplicate = new ContainsDuplicate();
    }

    @Test
    void containsDuplicate() {

        assertThat(containsDuplicate.containsDuplicate(new int[]{1,2,3,1}))
                .isTrue();

    }

    @Test
    void containsDuplicateFalse() {

        assertThat(containsDuplicate.containsDuplicate(new int[]{1,2,3,4}))
                .isFalse();

    }

    @Test
    void containsDuplicateTrue() {

        assertThat(containsDuplicate.containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2}))
                .isTrue();

    }
}
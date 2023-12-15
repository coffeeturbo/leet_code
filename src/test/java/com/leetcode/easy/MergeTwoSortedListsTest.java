package com.leetcode.easy;

import com.leetcode.easy.MergeTwoSortedLists.ListNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MergeTwoSortedListsTest {

    private final MergeTwoSortedLists executor = new MergeTwoSortedLists();

    @Test
    void shouldMergeTwoListsWhenSingleElements() {

        var first = new ListNode(1);
        var second = new ListNode(2);

        var expected = new ListNode(1, new ListNode(2));

        var actual = executor.mergeTwoLists(first, second);

        assertThat(actual).isEqualTo(expected);
    }


    @Test
    void shouldMergeTwoRegularLists() {

        var first = new ListNode(1, new ListNode(2, new ListNode(4)));
        var second = new ListNode(1, new ListNode(3, new ListNode(4)));

        var expected = new ListNode(1,
                            new ListNode(1,
                                    new ListNode(2,
                                        new ListNode(3,
                                                new ListNode(4,
                                                        new ListNode(4))))));


        var actual = executor.mergeTwoLists(first, second);
        assertThat(actual).isEqualTo(expected);
    }
}
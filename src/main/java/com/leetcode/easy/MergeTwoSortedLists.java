package com.leetcode.easy;

import lombok.EqualsAndHashCode;


public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode mergedList = new ListNode();
        var result = mergedList;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                mergedList.next = list1;
                list1 = list1.next;
            } else {
                mergedList.next = list2;
                list2 = list2.next;
            }
            mergedList = mergedList.next;
        }

        if (list1 == null) {
            mergedList.next = list2;
        }
        if (list2 == null) {
            mergedList.next = list1;
        }

        return result.next;
    }


    @EqualsAndHashCode
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

}

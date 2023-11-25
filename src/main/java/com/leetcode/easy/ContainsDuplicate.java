package com.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {

        Set<Integer> digits = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (digits.contains(nums[i])) {
                return true;
            } else {
                digits.add(nums[i]);
            }
        }

        return false;
    }
}

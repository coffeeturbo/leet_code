package com.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromSortedArray {


    public int removeDuplicates(int[] nums) {
        if (nums.length <= 0 || nums.length > 30000) {
            return 0;
        }

        Set<Integer> unique = new HashSet<>();
        int current = 0;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] < -100 || nums[i] > 100) {
                return 0;
            }

            if (!unique.contains(nums[i])) {
                unique.add(nums[i]);
                nums[current++] = nums[i];
            }
        }

        return unique.size();
    }


}

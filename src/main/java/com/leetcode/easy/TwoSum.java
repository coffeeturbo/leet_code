package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> digits = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int ostatok = target - nums[i];

            if (digits.containsKey(ostatok)) {
                return new int[]{digits.get(ostatok), i};
            }

            digits.put(nums[i], i);
        }
        return new int[]{};
    }

}

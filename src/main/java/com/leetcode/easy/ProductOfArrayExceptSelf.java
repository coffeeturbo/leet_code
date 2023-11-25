package com.leetcode.easy;

public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {

        int[] leftProduct = new int[nums.length];
        leftProduct[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            leftProduct[i] = leftProduct[i - 1] * nums[i - 1];
        }


        int r = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            leftProduct[i] = leftProduct[i] * r;
            r = r * nums[i];
        }

        return leftProduct;
    }


    public int[] productLeft(int[] nums) {

        int[] rsl = new int[nums.length];
        rsl[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            rsl[i] = rsl[i - 1] * nums[i - 1];
        }

        return rsl;
    }

    public int[] productRight(int[] nums) {

        int size = nums.length;

        int[] rsl = new int[size];
        rsl[size - 1] = 1;
        for (int i = size - 2; i >= 0; i--) {
            rsl[i] = rsl[i + 1] * nums[i + 1];
        }


        return rsl;
    }

}

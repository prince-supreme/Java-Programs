package Leetcode;

import java.util.HashSet;

public class ContainDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            hs.add(nums[i]);
        }
        // if both are equal it means thier is no duplicate
        if (hs.size() == nums.length) {

            return false;
        }
        // their is duplicate
        return true;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 4, 1 };
        System.out.println(containsDuplicate(nums));

    }
}

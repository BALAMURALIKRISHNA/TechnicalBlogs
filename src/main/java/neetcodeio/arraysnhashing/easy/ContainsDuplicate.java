package neetcodeio.arraysnhashing.easy;

import java.util.HashSet;


/**
 * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,1]
 * Output: true
 * Example 2:
 *
 * Input: nums = [1,2,3,4]
 * Output: false
 * Example 3:
 *
 * Input: nums = [1,1,1,3,3,4,3,2,4,2]
 * Output: true
 */
public class ContainsDuplicate {

    public boolean hasDuplicate(int[] nums){
       // List ls = Arrays.asList(nums);
        boolean containsDuplicate = false;
        HashSet<Integer> set = new HashSet<Integer>();
        for(Integer i : nums){
            try {
                if(set.contains(i)){
                    containsDuplicate = true;
                    return containsDuplicate;
                }
                set.add(i);
            } catch(Exception e){
                System.out.println("Stack trace"+e);
            }
        }
        return containsDuplicate;
    }

    public static void main(String[] args){
        ContainsDuplicate cd = new ContainsDuplicate();
        int[] nums = {1,2,2,4,5,7};
        boolean flag = cd.hasDuplicate(nums);
        System.out.println("Has duplicate ="+ flag);
    }
}

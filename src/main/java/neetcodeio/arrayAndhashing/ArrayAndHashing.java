package neetcodeio.arrayAndhashing;

import java.util.HashSet;

public class ArrayAndHashing {
    /**
     *Input: nums = [1,1,1,3,3,4,3,2,4,2]
     * Output: true
     *
     *Input: nums = [1,2,3,4]
     * Output: false
     *
     *
     *
     * @param nums
     * @return
     */

    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> hs = new HashSet<>();

        int i=0;
        boolean flag  = false;
        while(i<nums.length){

            if(hs.contains(nums[i])){
                System.out.println("nums[i] is duplicate"+nums[i]);
                flag = true;
                break;
            }else{
                hs.add(nums[i]);
            }

            i= i+1;

        }
        return  flag;
    }
}

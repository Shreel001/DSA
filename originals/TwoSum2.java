package originals;

/*
You are given a 1-indexed array of integers numbers that is already sorted in non-decreasing order.
Find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.

Return the indices of the two numbers index1 and index2 as an integer array [index1, index2] of length 2.

The tests are generated such that there is exactly one solution. You may not use the same element twice.

Your solution must use only constant extra space.

*/

import java.util.Arrays;

public class TwoSum2 {

    int[] sum(int[] nums, int target){

        int left = 0;
        int right = nums.length-1;
        int sum = nums[left] + nums[right];
        int[] index = new int[2];

        while(sum!=target){

            if(sum < target){
                left+=1;
            }else{
                right-=1;
            }
            sum = nums[left]+nums[right];
        }
        index = new int[]{left,right};

        return index;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,19};
        int target = 9;
        TwoSum2 twoSum2 = new TwoSum2();
        int[] summation = twoSum2.sum(nums,target);
        System.out.println(Arrays.toString(summation));
    }
}

package revisions;/*

Given an integer array nums, find the subarray with the largest sum, and return its sum.

nums = [-5,4,-1,7,8]

*/

import java.util.Arrays;

public class MaxSubArray {

    int subArray(int[] nums){
        int right = 1;
        int left = 0;
        int length = nums.length;
        int tempSum = nums[0];
        int maxSum = tempSum;
        int[] index = new int[2];

        while (right <length){

            if(tempSum < 0){
                tempSum = 0;
                left = right;
            }

            tempSum += nums[right];
            if(tempSum > maxSum){
                maxSum = Math.max(maxSum, tempSum);
                index = new int[]{left, right};
            }
            right++;
        }
        System.out.println(Arrays.toString(index));
        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {-5,4,-1,7,8};
        MaxSubArray maxSubArray = new MaxSubArray();
        int maxSum = maxSubArray.subArray(nums);
        System.out.println(maxSum);
    }
}

package originals;

/*

Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
Notice that the solution set must not contain duplicate triplets.

Example :

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]

*/

import java.util.*;

public class ThreeSum {

    int[][] sum(int[] nums) {

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int left = 0;
        int mid = 1;
        int right = nums.length-1;

        ArrayList<int[]> result = new ArrayList<>(){};
        while(left<right){
            if(nums[right] + (nums[left]+nums[mid]) == 0){
                result.add(new int[]{nums[left],nums[mid],nums[right]});
                right--;
                left++;
                mid++;
                while(left<right && nums[left] == nums[left-1]){
                    left++;
                    right++;
                    mid++;
                }
            } else if (nums[right]+(nums[left]+nums[mid]) > 0) {
                right--;
            }else {
                mid++;
            }
        }
        return result.toArray(new int[0][]);
    }

    public static void main(String[] args) {
        int[] nums = {-1,-1,0,0,1,1};
        int[] nums2 = {-4, -1, -1, 0, 1, 2, 5};
        int[] nums3 = {-1,0,1};
        int[] nums4 = {-1,-1,0,1,2};

        ThreeSum threeSum = new ThreeSum();

        int[][] result = threeSum.sum(nums);
        System.out.println(Arrays.deepToString(result));

        System.out.println();

        int[][] result2 = threeSum.sum(nums2);
        System.out.println(Arrays.deepToString(result2));

        System.out.println();

        int[][] result3 = threeSum.sum(nums3);
        System.out.println(Arrays.deepToString(result3));

        System.out.println();

        int[][] result4 = threeSum.sum(nums4);
        System.out.println(Arrays.deepToString(result4));
    }

}

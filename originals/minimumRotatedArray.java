package originals;

/*

Given an array of unique integers nums sorted in ascending order, which has been rotated between 1 and n times, return the minimum element.

You must write an algorithm that runs in O(log n) time.

*/

public class minimumRotatedArray {

    int minimum(int[] nums) {

        int left = 0; //0
        int right = nums.length - 1; //4

        while (left < right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return nums[left];
    }


    public static void main(String[] args) {
        int[] nums = {4,5,1,2,3};
        minimumRotatedArray inst = new minimumRotatedArray();
        int index = inst.minimum(nums);
        System.out.println(index);
    }

}
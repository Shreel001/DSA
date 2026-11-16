package revisions;

/*

Given an array of unique integers nums sorted in ascending order, which has been rotated between 1 and n times, return the minimum element.
You must write an algorithm that runs in O(log n) time.

nums = [8,1,2,3,4,5,6,7]
nums2 = [4,5,1,2,3]
target = 5

*/

public class SearchMinRotatedArray {

    int minElement(int[] nums, int target){

        if(nums.length == 0){
            return -1;
        }

        int left = 0;
        int right = nums.length - 1;
        int mid;

        while(left<=right){

            mid =  left + (right-left)/2;

            if (nums[mid] == target) {
                return mid;
            }

            if(nums[left] <= nums[mid]){
                if(target >= nums[left] && target < nums[mid]){
                    right = mid - 1;
                }else{
                    left = mid + 1;
                }
            }else{
                if(target > nums[mid] && target <= nums[right]){
                    left = mid + 1;
                }else{
                    right = mid - 1;
                }
            }
        }

        return -1;
    }


    public static void main(String[] args) {
        int[] nums = {1,2};
        SearchMinRotatedArray minRotatedArray = new SearchMinRotatedArray();
        int found = minRotatedArray.minElement(nums, 1);
        System.out.println(found);
    }
}

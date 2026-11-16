package revisions;

public class MinRotatedArray {

    int minimum(int[] nums){

        int left = 0;
        int right = nums.length - 1;
        int mid = left + (right-left)/2;

        while(left<right){

            mid = left + (right-left)/2;
            if(nums[right] > nums[mid]){
                right = mid;
            }else{
                left = mid + 1;
            }

        }

        return nums[mid];
    }

    public static void main(String[] args) {
        int[] nums = {8,0,1,2,3,4,5,6,7};
        MinRotatedArray minRotatedArray = new MinRotatedArray();
        int min = minRotatedArray.minimum(nums);
        System.out.println(min);
    }
}

// [4,5,6,7,1,2,3]
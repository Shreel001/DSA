package originals;
import java.util.Arrays;

public class BubbleSort {

    int[] sort(int[] nums){

        for(int i = 0; i < nums.length; i++){
            int left = 0;
            int right = 1;
            int temp;
            while(right < nums.length){
                if(nums[right] < nums[left]){
                    temp = nums[left];
                    nums[left] = nums[right];
                    nums[right] = temp;
                }
                left++;
                right++;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {7,2,-1,0,5,8};
        BubbleSort inst = new BubbleSort();
        int[] arr = inst.sort(nums);
        System.out.println(Arrays.toString(arr));
    }
}
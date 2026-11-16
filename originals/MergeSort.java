package originals;

// [-1,0,7,2,5,8]
// [-1,0] [2,7]

import java.util.Arrays;

public class MergeSort {

    int[] merge(int[] left, int[] right){
        int i = 0;
        int j = 0;
        int k = 0;
        int[] result = new int[left.length + right.length];
        while(i < left.length && j < right.length){
            if(left[i] < right[j]){
                result[k] = left[i];
                i++;
            }else{
                result[k] = right[j];
                j++;
            }
            k++;
        }

        while(i<left.length){
            result[k] = left[i];
            i++;
            k++;
        }

        while (j<right.length){
            result[k] = right[j];
            j++;
            k++;
        }

        return result;
    }

    int[] mergeSort(int[] nums){
        if (nums.length <= 1) {
            return nums;
        }
        int mid = nums.length/2;
        int[] left = Arrays.copyOfRange(nums,0,mid);
        int[] right = Arrays.copyOfRange(nums,mid,nums.length);

        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left, right);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{-1,0,7,2,5,8};
        MergeSort mergeSort = new MergeSort();
        int[] result = mergeSort.mergeSort(arr);
        System.out.println(Arrays.toString(result));
    }

}

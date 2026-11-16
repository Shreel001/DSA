package originals;

import java.util.ArrayList;
import java.util.Arrays;

public class ThreeSum2 {

    int[][] sum(int[] nums) {
        ArrayList<int[]> result = new ArrayList<>();

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        for (int fixed = 0; fixed < nums.length - 2; fixed++) {

            if (fixed > 0 && nums[fixed] == nums[fixed - 1]) {
                continue;
            }

            int left = fixed + 1;
            int right = nums.length - 1;

            while (left < right) {

                int total = nums[fixed] + nums[left] + nums[right];

                if (total == 0) {

                    result.add(new int[]{
                            nums[fixed], nums[left], nums[right]
                    });

                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }

                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }

                    left++;
                    right--;

                } else if (total > 0) {
                    right--;
                } else {
                    left++;
                }
            }
        }

        return result.toArray(new int[0][]);
    }

    public static void main(String[] args) {
        int[] nums = {-1,-1,0,0,1,1};
        int[] nums2 = {-4, -1, -1, 0, 1, 2, 5};
        int[] nums3 = {-1,0,1};
        int[] nums4 = {-1,-1,0,1,2};

        ThreeSum2 threeSum2 = new ThreeSum2();

        int[][] result = threeSum2.sum(nums);
        System.out.println(Arrays.deepToString(result));
        System.out.println();

        int[][] result2 = threeSum2.sum(nums2);
        System.out.println(Arrays.deepToString(result2));
        System.out.println();

        int[][] result3 = threeSum2.sum(nums3);
        System.out.println(Arrays.deepToString(result3));
        System.out.println();

        int[][] result4 = threeSum2.sum(nums4);
        System.out.println(Arrays.deepToString(result4));
        System.out.println();
    }

}

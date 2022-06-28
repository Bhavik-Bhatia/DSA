package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class max_subarray {
    public static int maxSubArray(int[] nums) {

        int maxSum = 0;
        List<Integer> list = new ArrayList<>();
        for (int i=0; i < nums.length; i++){

            if(maxSum < 0 ){
                maxSum = 0;
            }
            maxSum=maxSum+nums[i];
            list.add(maxSum);
        }
        return Collections.max(list);
    }

    public static void main(String args[]) {

        int[] nums = {-1,9,-1,4};
        System.out.println(max_subarray.maxSubArray(nums));

    }
}

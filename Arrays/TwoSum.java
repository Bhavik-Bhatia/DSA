package Arrays;

import java.util.HashMap;


public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> map = new HashMap<>();

        int[] arr = new int[2];

        for(int i=0;i<nums.length;i++){

            if(map.containsKey(nums[i])){
                arr[0]=map.get(nums[i]);
                arr[1]=i;

            }
            map.put(target-nums[i],i);
            //<Value,Index>
        /*
            1)<2,0>
            2)<4,1>
            3)<6,2>
            4)As it contains <3,3>
            Value[0]+Value[3]=Target
            Return the indices
         */

        }

        return arr;
    }

    public static void main(String args[]){


        int[] nums = {4,2,0,4};
        int[] arr=TwoSum.twoSum(nums,6);
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }


}

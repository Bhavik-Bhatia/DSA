package Arrays;

public class productExceptSelf {

    public static int[] productExceptSelf(int[] nums) {
        int[] output_arr = new int[nums.length];

        int prefix=1;
        for (int i=0; i<nums.length;i++){
            output_arr[i]=prefix;
            prefix=prefix*nums[i];
        }

        int postfix=1;
        for (int i=nums.length-1; i>=0;i--){
            output_arr[i]=output_arr[i]*postfix;
            postfix=postfix*nums[i];
        }

        return output_arr;
    }

    public static void main(String args[]) {
        int[] nums = {1,2,3,4};
        int[] arr=productExceptSelf.productExceptSelf(nums);
        for (int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }


}

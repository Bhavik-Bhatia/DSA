package Arrays;

public class Buy_Sell_Problem {

    public static int buy_sell(int[] nums) {

        int buy_price = Integer.MAX_VALUE;
        int profit = 0;


        for (int i=0; i<nums.length; i++){

            if(nums[i] < buy_price){
                buy_price = nums[i];
            }else if(profit < nums[i] - buy_price){
                profit = nums[i]-buy_price;
            }

        }
        return profit;
    }


    public static void main(String args[]) {
        int[] nums = {2,9,12,1};
        System.out.println(Buy_Sell_Problem.buy_sell(nums));
    }
}
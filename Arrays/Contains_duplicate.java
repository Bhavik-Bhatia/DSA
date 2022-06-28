package Arrays;

import java.util.*;

/*
Explanation:

We use Set data structure as it gives us add() which only adds data if it not present in the set.
Otherwise it returns false

 */


public class Contains_duplicate {
    public boolean containsDuplicate(int[] nums){
        Set<Integer> set = new HashSet<>();

        for(int n : nums){
            if(!set.add(n))
                return true;
        }

        return false;
    }

    public static void main(String args[]){

        Contains_duplicate obj = new Contains_duplicate();
        int[] nums = {1,2,3,4};
        System.out.println(obj.containsDuplicate(nums));

    }
}



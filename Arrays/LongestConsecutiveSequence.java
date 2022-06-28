package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class LongestConsecutiveSequence {
    public static int longestConsecutiveSequence(int[] nums) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (nums.length==0){
            return 0;
        }
        for (int a:nums){
            arrayList.add(a);
        }
        Collections.sort(arrayList);

        int count=1;
        int x = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i=0;i<arrayList.size();i++){
            if (i!=0){
                //Logic
                if(x==arrayList.get(i)){
                    x=arrayList.get(i);
                }
                else if ((x+1)==arrayList.get(i) ){
                    count=count+1;
                    x=arrayList.get(i);
                }else{
                    ans.add(count);
                    count=1;
                    x=arrayList.get(i);
                }
            }else {
                x=arrayList.get(0);
            }

        }
        ans.add(count);

        return Collections.max(ans);

    }
    public static void main(String args[]) {
        int arr[] = {1,2,0,1};
        //Answer:3
        System.out.println(LongestConsecutiveSequence.longestConsecutiveSequence(arr));


    }


}

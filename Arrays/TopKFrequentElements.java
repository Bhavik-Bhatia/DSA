package Arrays;

import javax.swing.*;
import java.util.*;

public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> hash = new HashMap<>();
        //Value : Count
        //O(N) Space and Time Complexity

        int count = 1;
        for (int i = 0; i < nums.length; i++) {
            if (hash.containsKey(nums[i])) {
                hash.put(nums[i], hash.get(nums[i]) + 1);
            } else {
                hash.put(nums[i], count);
            }
        }

        PriorityQueue<Map.Entry<Integer,Integer>> minheap = new PriorityQueue<>(
                (a,b)->a.getValue()-b.getValue());
        //O(Nlogk) Space Complexity

        for (Map.Entry<Integer,Integer> map:hash.entrySet()){
            minheap.add(map);
            if (minheap.size()>k){
                minheap.poll();
            }
        }

        int[] topNumbers = new int[k];
        int i=0;
        while (i<=k-1){
           topNumbers[i]=minheap.peek().getKey();
           minheap.poll();
           i++;
        }

        return topNumbers;
    }

    public static void main(String args[]) {
        int[] nums = {5,5,5,5,1,1,2,3,3,3,7,7,7,7,6,6,6,6,6};
        int k=2;

        TopKFrequentElements obj = new TopKFrequentElements();
        System.out.println(obj.topKFrequent(nums,k));
    }

}

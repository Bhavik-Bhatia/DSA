package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class mergeSortedArrays {

    public int[] mergeSortedArraysFunc(int[] a1,int[] a2){

        List<Integer> l = new ArrayList<>(); //SC: O(1)

        for (int i=0;i<a2.length;i++){  //SC: O(n), TC: O(n)
            l.add(a2[i]);
        }
        for(int i=0;i<a1.length;i++){  //SC: O(2n+1), TC: O(2n)
            l.add(a1[i]);
        }

        //Sorting
        Collections.sort(l);  //SC: O(2n+1), TC: O(2n)

        int[] result = new int[l.size()]; //SC: O(2n+2), TC: O(2n+3)
        for (int i=0;i<l.size();i++){  //SC: O(3n+2), TC: O(3n+3)
            result[i]=l.get(i);
        }

        return result;

        //WorstCase: TC=O(n)
        //WorstCase: SC=O(n)
    }


    public static void main(String args[]) {

        int[] a1 = {1,2,3,16};
        int[] a2 = {5,4,7,8};

        mergeSortedArrays obj = new mergeSortedArrays();

        int[] arr=obj.mergeSortedArraysFunc(a1,a2);

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }


}

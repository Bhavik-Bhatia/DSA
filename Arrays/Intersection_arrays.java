package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Intersection_arrays {
    public static int[] intersection(int[] nums1, int[] nums2) {

        List new_list = new ArrayList();

        List l1 = Arrays.asList(nums1);
        List l2 =Arrays.asList(nums2);



        for (int i=0; i<l1.size(); i++){
            if (l2.contains(l1.get(i))){
                if(!new_list.contains(l1.get(i))){
                    new_list.add(l1.get(i));
                }
            }
        }

        int[] arr = new int[new_list.size()];
        System.out.println(new_list);

        for (int i=0; i<new_list.size();i++){
            arr[i] = (int)new_list.get(i);
        }

        return arr;

    }

    public static void main(String args[]) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};

        int[] arr = Intersection_arrays.intersection(nums1,nums2);
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }

}

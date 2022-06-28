package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Group_Anagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String,List<String>> map = new HashMap<>();
        //askey:[word1,word3]
        List<List<String>> list = new ArrayList<>();
        //Condition 1
        if (strs.length==0){
            return list;
        }

        //Word Iteration
        for(int i=0; i<strs.length; i++){

            char[] arr = strs[i].toCharArray();
            char[] askey = new char[26];

            //Letter Iteration
            for (int j=0; j<arr.length; j++){
                askey[arr[j]-'a']++;
                //I get a key
                //[[tan, nat], [eat, tea, ate], [bat, tab]]
            }

            String s = String.valueOf(askey);

            if (map.get(s) == null){
                //Stored key
                map.put(s,new ArrayList<>());
            }

            //If we get the same key askey we add current word into the value as list of lists
            map.get(s).add(strs[i]);
        }

        list.addAll(map.values());
        return list;
    }

    public static void main(String args[]) {
        String[] str = {"eat","tea","tan","ate","nat","batz","ztab"};
        System.out.println(Group_Anagrams.groupAnagrams(str));
    }

}

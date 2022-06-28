package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class valid_anagram {

    public static boolean isAnagram(String s, String t) {
        if (s.length()==t.length()){
            List<Character> list1 = new ArrayList<>();
            List<Character> list2 = new ArrayList<>();
            for (int i=0; i<s.length();i++){

                 list1.add(s.charAt(i));
                 list2.add(t.charAt(i));
            }
            Collections.sort(list1);
            Collections.sort(list2);

            if (list1.equals(list2)){
                return true;
            }

        }

        return false;
    }

    public static void main(String args[]) {
        String s = "anagram";
        String t = "nagrama";
        System.out.println(valid_anagram.isAnagram(s,t));
    }

}

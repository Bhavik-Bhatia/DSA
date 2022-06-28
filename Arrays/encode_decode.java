package Arrays;

import java.util.ArrayList;
import java.util.List;

public class encode_decode {

    public void encode(List<String> strs) {
        StringBuilder builder = null;
        for (int i=0;i<strs.size();i++){
            String s = strs.get(i)+":;";
            strs.add(i,s);

        }
        System.out.println(strs.toString());
    }

//    public List<String> decode(String str) {
//        // write your code here
//    }

    public static void main(String[] args){
        encode_decode obj = new encode_decode();
        List<String> list = new ArrayList<>();
        list.add("lint");
        list.add("code");
        list.add("love");
        list.add("you");

        obj.encode(list);
    }
}

package Arrays;

public class StringReverseRepeat {

    public String reverseString(String s){

        char[] array= s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i=array.length-1;i>=0;i--) {
            //System.out.println(array[i]);
            sb.append(array[i]);
        }
        return sb.toString();
    }

    public static void main(String args[]) {
        String s= "kivahB";

        StringReverseRepeat obj = new StringReverseRepeat();
        System.out.println(obj.reverseString(s));
    }

}

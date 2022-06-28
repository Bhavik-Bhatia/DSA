package Arrays;

public class StringReverse {

    public void reverseString(char[] s) {

        int k=0;
        int e=s.length-1;


        for(int i=0;i<s.length;i++){

            if(k<e){
                char temp = s[k];
                s[k]=s[e];
                s[e]=temp;
                k++;
                e--;
            }

        }
        System.out.println(s);
    }



    public static void main(String args[]) {
        char[] s = {'h','e','l','l','o'};

        StringReverse obj = new StringReverse();
        obj.reverseString(s);
    }

}

package Arrays;

public class PowerOfThree {
    public boolean isPowerOfThree(int n) {
        //n=9
        //9=3^x
        //log3(9)=x

        double x = Math.log10(n)/Math.log10(4);

        int rn = (int) Math.round(x);

        if(Math.pow(4,rn)==n){
            return true;
        }
        return false;


    }

    public static void main(String args[]) {

        int n=16;

        PowerOfThree obj = new PowerOfThree();
        System.out.println(obj.isPowerOfThree(n));

    }

}

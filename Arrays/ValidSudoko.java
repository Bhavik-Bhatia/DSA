package Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class ValidSudoko {
    boolean validSudoko(char[][] arr){

        HashSet<String> hashSet = new HashSet<>();

        for (int i=0;i<9;i++){
            for (int j=0;j<9;j++){
                if (arr[i][j]=='.'){
                    continue;
                }
                //Checking if row contains element between 1-9
                if (hashSet.contains("Row"+":"+i+":"+arr[i][j]) || hashSet.contains("Col"+":"+j+":"+arr[i][j])){
                    return false;
                }
                hashSet.add("Row"+":"+i+":"+arr[i][j]);
                hashSet.add("Col"+":"+j+":"+arr[i][j]);

                //Checking for 3x3
                if (hashSet.contains("3x3"+":"+(i/3)+":"+(j/3)+":"+arr[i][j])){
                    return false;
                }
                hashSet.add("3x3"+":"+(i/3)+":"+(j/3)+":"+arr[i][j]);
            }
        }
        return true;
    }

    public static void main(String args[]) {
        char[][] arr =                {
                 {'5','3','.','.','7','.','.','.','.'}
                ,{'5','.','.','1','9','5','.','.','.'}
                ,{'.','9','8','.','.','.','.','6','.'}
                ,{'8','.','.','.','6','.','.','.','3'}
                ,{'4','.','.','8','.','3','.','.','1'}
                ,{'7','.','.','.','2','.','.','.','6'}
                ,{'.','6','.','.','.','.','2','8','.'}
                ,{'.','.','.','4','1','9','.','.','5'}
                ,{'.','.','.','.','8','.','.','7','9'}
        };

        ValidSudoko v = new ValidSudoko();
        System.out.println(v.validSudoko(arr));


    }

}

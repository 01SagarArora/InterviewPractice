package otherInterview;

import java.util.HashSet;

import java.util.Set;


/**
 * Created by sagararora on 07/04/24.
 */
public class StringPermutationsUsingSwap {


    public static char[] swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }

    public static void permutation(char[] str2) {

        int l = 0;
        Set<String> result = new HashSet();
        permute(str2, l+1 ,result);

    }

    private static void permute(char[] string, int index, Set<String> result) {

        for(int i=index; i<string.length; i++){
            swap(string,index, i);
            result.add(string.toString());
            swap(string,index,i);
        }
        if(index != string.length)
        permute(string, index+1 , result);

    }

    public static void main(String[] args) {

        String str = "ABC";
        char [] str2 = str.toCharArray();
        permutation(str2);

    }


}

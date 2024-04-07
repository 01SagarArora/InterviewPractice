package leetcode.recursive;

/**
 * Created by Sagar Arora on 06/04/24.
 */

public class ArraySumRecursive {

    public static int arraySum(int[] arr, int index) {
        if (index < 0) {
            return 0;
        } else {
            return arr[index] + arraySum(arr, index - 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Sum of array elements: " + arraySum(arr, arr.length - 1));
    }

}

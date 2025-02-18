package Leetcode;

import java.util.Arrays;

public class ReplaceElementWithGreatest {

    // time complexity = O(n)
    // Space complexity = O(n)
    public static int[] replaceElements(int[] arr) {
        int len = arr.length;
        int max = -1;
        int arrnew[] = new int[len];
        for (int i = len - 1; i >= 0; i--) {
            arrnew[i] = max;
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return arrnew;
    }

    /*
     * //time complexity O(n2)
     * public static int[] replaceElements(int[] arr) {
     * for (int i = 0; i < arr.length; i++) {
     * int max = -1;
     * for (int j = i + 1; j < arr.length; j++) {
     * if (arr[j] > max) {
     * max = arr[j];
     * }
     * }
     * arr[i] = max;
     * }
     * return arr;
     * }
     */

    public static void main(String[] args) {
        int arr[] = { 17, 18, 5, 4, 6, 1 };
        // int arr[] = { 400 };
        // Arrays.toString(replaceElements(arr));
        System.out.println(Arrays.toString(replaceElements(arr)));
    }
}

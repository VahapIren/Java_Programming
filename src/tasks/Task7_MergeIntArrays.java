package tasks;

import utilities.ArraysUtility;

import java.util.Arrays;

public class Task7_MergeIntArrays {
    /*
    1. create a method that can merge two integer arrays.
     */
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6, 7};

        merge(arr1, arr2);
        //System.out.println("arr3 = " + Arrays.toString(arr3));


    }

    public static void merge(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];

        int i = 0;
        for (int each : arr1) {
            result[i++] = each;
        }
        for (int each : arr2) {
            result[i++] = each;
        }
        System.out.println("result = " + Arrays.toString(result));
    }

}

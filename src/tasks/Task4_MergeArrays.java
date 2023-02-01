package tasks;

import java.util.Arrays;

public class Task4_MergeArrays {
    /*
    Write a program that can merge 3 arrays of integers

    		Ex:
    			arr1 = {30, 10, 20};
    			arr2 = {15, 40, 25, 35};
    			arr3 = {8, 9, 17, 5, 4, 1}

			Output:
				{30,10,20,15,40,25,35,8,9,17,5,4,1}
     */
    public static void main(String[] args) {


        int[] arr1 = {30, 10, 20};
        int[] arr2 = {15, 40, 25, 35};
        int[] arr3 = {8, 9, 17, 5, 4, 1};
        int length=arr1.length+arr2.length+arr3.length;
        int[] result = new int[length];

        int i =0;
        for (int each : arr1) {
            result[i++] = each;
        }
        for (int each : arr2) {
            result[i++] = each;
        }
        for (int each : arr3) {
            result[i++] = each;
        }
        System.out.println(Arrays.toString(result));

        int dummy=result[0];
        result[0]=result[result.length-2];
        result[result.length-2]=dummy;
        System.out.println(Arrays.toString(result));
    }
}

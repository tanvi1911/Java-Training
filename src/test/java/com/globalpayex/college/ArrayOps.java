package com.globalpayex.college;

public class ArrayOps {

    public static float average(int[] arr1) {
        int sum = 0;
        for(int elements: arr1){
            sum += elements;
        }
        return (float)sum/arr1.length;
    }

    public static int max(int[] arr1) {
        int max = arr1[0];
        for(int elements: arr1)
        {
            max = Math.max(max, elements);
        }
        return max;
    }

    public static int nextGenSum(int... elements) {
        int sum = 0;
        for(int element : elements){
            sum += element;
        }
        return sum;
    }
}

package com.algo.java;

import java.util.Arrays;

public class SortingAlgorithms {



    int[] insertsort(int[] array){
        int len = array.length;

        for(int i = 1; i < len;i++){
            int ref = array[i];
            int j = i;

            while (j > 0 && array[j-1] < ref){
                //Every iteration this will swap the element
                array[j] = array[j-1];
                array[j-1] = ref;
                j--;
            }

            //This will only swap lowest and highest and not the middle elements
//            int temp = array[j];
//            array[j] =array[i];
//            array[i] = temp;
            System.out.println(Arrays.toString(array));
        }

        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new SortingAlgorithms().insertsort(new int[]{1,2,3,4,5,6,7,8,8})));
        int[] arr  = new int[]{1,2,3,4,5,6,7,8,8};
        char[] cha = new char[]{'a','b','c','d','e','f'};
        System.out.println(Arrays.toString(Arrays.copyOfRange(arr,3,11)));
        Arrays.fill(arr, 1);
        System.out.println(Arrays.toString(arr));

        java.util.Random rand = new java.util.Random();
        int[] arr1 = new int[11];
        for(int i =0;i< 11;i++){
            arr1[i] = rand.nextInt(800);
        }
        int[] akk = Arrays.stream(arr1).distinct().toArray();

        System.out.println(Arrays.toString(akk));
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.equals(akk,arr1));

    }
}

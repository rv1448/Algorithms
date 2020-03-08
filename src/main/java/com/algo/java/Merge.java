package com.algo.java;

import java.util.Arrays;

public class Merge {

    void MergeTest(int[]array1, int[] aux,int lo,int hi){

        int mid = lo+(hi - lo)/2;
        int j = mid+1;
        int k = lo;

        for(int i=0;i < array1.length;i++){
            if(k > mid) array1[i] = aux[j++];
            else if(j > hi) array1[i] = aux[k++];
            else if (aux[k] <= aux[j]) array1[i] =aux[k++];
            else array1[i] = aux[j++];
        }
        System.out.println(Arrays.toString(array1));
    }

    void Sorttest(int[] arr, int lo,int hi){
        int mid = lo+(hi-lo)/2;


    }

    void MergeSort(int[] array1){
        int[] aux = new int[array1.length];
        System.arraycopy(array1,0,aux,0,aux.length);

        int lo = 0;
        int hi = array1.length-1;
        int mid = lo+(hi - lo)/2;
        while(lo < hi) {
            Sorttest(array1, lo, mid);
            Sorttest(array1, mid + 1, hi);
            MergeTest(array1, aux, lo, hi);
        }
        System.out.println(Arrays.toString(array1));


    }


    public static void main(String[] args) {
        //int[] array2 = new int[]{10,12,13,14,15,16};
//        int[] array1 = new int[]{4,5,6,11,2,3,10};
        int[] array1 = new int[]{10,9,8,7,6,5,4,3,2,1};
        new Merge().MergeSort(array1);
    }



}

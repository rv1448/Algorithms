package com.algo.java;

import java.util.Arrays;

/***
 * @description:
 * step1: sort left half of the array
 * step2: sort right half of the array
 * step3: merge the results
 */

public class MergeSortv2 {
    int k =0;
    void merge(int[] arr){
         int i = arr.length;
         int[] aux = new int[i];
         System.arraycopy(arr,0,aux,0,i);
         mergesort(arr, aux,0,i-1,0,"wholearray");
    }
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
   synchronized void mergesort(int[] arr,int[] aux, int lo, int hi,int i,String s){


        int mid = (hi+lo)/2;

       if(lo >= hi) return;
//        if (lo < hi) {
       ++i;
       System.out.println(String.format("%s= lo : %d, mid: %d, hi : %d, loop: %d",s, lo, mid, hi,i ));
            mergesort(arr,aux, lo, mid, i,"left");
            mergesort(arr,aux, mid+1, hi, i,"right");
            MergeTest(arr,aux,lo,hi);
           // System.out.println(String.format("%s= lo : %d, mid: %d, hi : %d, loop: %d",s, lo, mid, hi, i));

//        }

    }
    /***
     wholearray= lo : 0, mid: 3, hi : 6, loop: 1
    left= lo : 0, mid: 1, hi : 3, loop: 2
    left= lo : 0, mid: 0, hi : 1, loop: 3
    left= lo : 0, mid: 0, hi : 0, loop: 4 return
    right= lo : 1, mid: 1, hi : 1, loop: 4 return
    right= lo : 2, mid: 2, hi : 3, loop: 3
    left= lo : 2, mid: 2, hi : 2, loop: 4 return
    right= lo : 3, mid: 3, hi : 3, loop: 4 return
    right= lo : 4, mid: 5, hi : 6, loop: 2
    left= lo : 4, mid: 4, hi : 5, loop: 3
    left= lo : 4, mid: 4, hi : 4, loop: 4 return
    right= lo : 5, mid: 5, hi : 5, loop: 4 return
    right= lo : 6, mid: 6, hi : 6, loop: 3  return
****/
    //void mergeresults()
    public static void main(String[] args) {
        int[] arr1 = new int[]{9,8,7,6,5,4,3};
        new MergeSortv2().merge(arr1);
    }


}

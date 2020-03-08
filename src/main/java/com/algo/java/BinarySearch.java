package com.algo.java;

/***
 *
 * @input: integer array; int to search
 * @output: boolean to return the status
 * @method: binarysearch
 * O(n) = log(n) => logarithmic
 * @Future: implement recursive one
 */

public class BinarySearch {

    boolean binarysearch(int[] arr, int search){
        int N = arr.length;

        int low = 0;
        int high = N;
        int mid =0;
        while(low <= high){
            mid = (low+high)/2;


            if (arr[mid] < search ) {
             System.out.println(String.format(" First  {low: %d, mid: %d, high: %d, a[mid]: %d}", low, mid, high, arr[mid]));
                low = mid+1 ;
            }

            else if (arr[mid] > search){
             System.out.println(String.format(" second {low: %d, mid: %d, high: %d, a[mid]: %d}", low, mid, high, arr[mid]));
                high = mid-1;
            }

            else if (arr[mid] == search) {
                System.out.println(String.format("Found: %d",arr[mid]));
                return true;
            }
        }
        return false;
    }



    public static void main(String[] args){
        BinarySearch bs = new BinarySearch();
       int[] a =  new int[]{1,2,3,4,7,8,9,10,11,12,14,15,16,17};
       
          bs.binarysearch(a, 15);
          bs.binarysearch(a, 11);
          bs.binarysearch(a, 9);
          bs.binarysearch(a, -1);
    }

}

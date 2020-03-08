package com.algo.java;


import java.util.Arrays;
import java.util.Calendar;

public class MergeSortV3 {
    void mergesort(int[] iniarr){
        int N = iniarr.length;
        int[] aux = new int[N];
        System.arraycopy(iniarr,0,aux,0,N);
//        System.out.println(Arrays.toString(iniarr));
//        System.out.println(Arrays.toString(aux));
        System.out.println("@@@@");
        for(int m = 0;m < aux.length;m++){
            aux[m] = 0;
        }
        sort(iniarr,aux,0,N-1,"arr");

    }

    public void sort(int[] iniarr,int[] aux,int start,int end,String s){
        int lstart = start;
        int lend = end;
        int mid = (start+end)/2;
        if(start >= end) return;
//        System.out.println(String.format("%s= lo : %d, mid: %d, hi : %d",s, lstart, mid, lend));
        sort(iniarr,aux,lstart,mid,"left");
        sort(iniarr,aux,mid+1,lend,"right");
        merge(iniarr,aux,start,end,s);

    }

    void merge(int[] iniarr,int[] aux,int start, int end, String s) {
        System.out.println(String.format("start: %d, end: %d call : %s", start, end, s));

        int mid = (start + end) / 2;
        int firstart = start;
        int firend = mid;
        int secstart = mid+1;
        int secend = end;
        System.out.println(String.format("firstart: %d, firend: %d, secstart:%d, secend:%d", firstart, firend, secstart,secend));
//        System.out.println(String.format("start: %d, end: %d call : %s", start, end, s));

//        for(int i = firstart;i <= secend;i++)
//            if (firstart > firend) aux[i] = iniarr[secstart++];
//            else if (secstart > secend) aux[i] = iniarr[firstart++];
//            else if (iniarr[firstart] <= iniarr[secstart]) aux[i] = iniarr[firstart++];
//            else {aux[i] = iniarr[secstart++];}
//        firstart: 0, firend: 0, secstart:1, secend:1
//                mid = 0                 mid = 1
//        firstart: 0, firend: 1, secstart:2, secend:2
//        mid = 0

       // System.out.println(String.format("firstart: %d, secstart : %d,firend : %d", firstart, secstart, firend));
//        for (int i = firstart; i <= secend; i++) {
//           // System.out.println(String.format("%d %d", iniarr[firstart], iniarr[secstart]));
//            if (firstart > firend) {
//                aux[i] = iniarr[secstart++];
//            } else if (secstart > secend) {
//                aux[i] = iniarr[firstart++];
//            } else if (iniarr[firstart] <= iniarr[secstart]) {
//                aux[i] = iniarr[firstart++];
//            } else if (iniarr[firstart] > iniarr[secstart]) {
//                aux[i] = iniarr[secstart++];
//            }
//        }
        //System.out.println(String.format("%d, %d",aux[firstart],aux[firend]));
      //  System.out.println(Arrays.toString(aux));


//
//            System.out.println(String.format("start : %d, end : %d, mid : %d",start,end,mid));
//            System.out.println(String.format("i : %d, mid : %d, secstart : %d, firend : %d",i,mid,secstart,firend));
//           // System.out.println(String.format("%d %d", iniarr[firstart],iniarr[secstart]));

//
//        }

//        int mid = lo+(hi - lo)/2;
//        int j = mid+1;
//        int k = lo;
//
//        for(int i=0;i < array1.length;i++){
//            if(k > mid) array1[i] = aux[j++];
//            else if(j > hi) array1[i] = aux[k++];
//            else if (aux[k] <= aux[j]) array1[i] =aux[k++];
//            else array1[i] = aux[j++];
//        }
//        System.out.println(Arrays.toString(array1));
//

    }

    public static void main(String[] args) {
        //int[] arr = new int[]{9,8,7,6,5,4,3};
        //[4, 8, 3, 6, 5, 4]
        //[5, 4, 3, 6, 3, 4]
        int[] arr = new int[]{6,5,4,3,2};
        new MergeSortV3().mergesort(arr);
    }
}








//  System.out.println(String.format("N : %d, mid : %d, secstart : %d, firend : %d",N,mid,secstart,firend));
//        while(start <= firend || secstart < end){
//            if( iniarr[start] <= iniarr[secstart]) //aux[N++] = iniarr[start++];
//            { N++; start++;}
//            else if (iniarr[start] > iniarr[secstart]) //aux[N++] = iniarr[secstart++];
//            { N++; secstart++;}
//            System.out.println(String.format("N : %d, mid : %d, secstart : %d, firend : %d",N,mid,secstart,firend));
//        }
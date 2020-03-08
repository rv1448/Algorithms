package com.algo.java;

public class Selection {

    public static void sort(Comparable[] a){
        int N = a.length;
        for(int i=0;i<N;i++){
            int min = i;
            for(int j=i+1;j<N;j++){
                if(less(a[i] ,a[min])) min = j;
            }
        exchange(a,i,min);

        }
    }


    static boolean less(Comparable a1,Comparable a2){
        int bool = a1.compareTo(a2);
        if (bool==-1) return false;
        else if(bool==1) return true;
        return false;
    }


    static void exchange(Comparable[] a, int i,int j){
        Comparable temp = a[j];
        a[j] = a[i];
        a[i] = temp;
    }




}

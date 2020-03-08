package com.algo.java;

import java.util.Iterator;

public class Iter<T> implements Iterable<T>{
    T[] init;
    int N;
    Iter(int i){
        init = (T[]) new Object[i];
        N = i;
    }


    @Override
    public Iterator<T> iterator(){

        return new Iterator<T>() {
            int i =0;
            @Override
            public boolean hasNext() {
                return i!=(N-1);
            }

            @Override
            public T next() {
                return init[i++];

            }
        };
    }

    int GCD(int p, int q){
        if(q==0) return p;
         else return GCD(q,p%q);
    }
    public static void main(String[] args) {
        System.out.println(216%192);
        System.out.println(192%24);
        System.out.println(new Iter<Integer>(4).GCD(216,192));

    }
}

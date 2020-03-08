package com.algo.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class StackOfStrings {
    String[] st;
    int N;
    int head;

    StackOfStrings(int n){
        st = new String[20];
        N=n;
    }

    void push(String item){
        st[head++] = item;
    }

    String pop(){
       if(!isEmpty()) {
           return st[--head];
       }
       return null;
    }

    boolean isEmpty(){
        return head ==0;
    }

    @Override
    public String toString(){
        return Arrays.toString(st);
    }

    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream in = new FileInputStream("/Users/RahulReddy/Desktop/Datastructures_Algorithms/ST.txt");
         Scanner sc = new Scanner(in);
         StackOfStrings st1 = new StackOfStrings(10);
         while (sc.hasNext()){
             st1.push(sc.next());
         }

         System.out.println(st1);

//        StackOfStrings st1 = new StackOfStrings(10);
//        st1.push("a");
//        st1.push("b");
//        st1.push("c");
//        System.out.println(st1.pop());
//        System.out.println(st1.pop());
//        System.out.println(st1.pop());
//        System.out.println(st1.pop());
    }


}

package com.algo.java;

import java.util.Collections;
import java.util.HashSet;

@FunctionalInterface
interface Hello{
    void sayhello();
}

@FunctionalInterface
interface Hello1{
    String sayhello();
}

public class HelloAnn {


    public static void main(String[] args) {


     Hello h = new Hello() {
         @Override
         public void sayhello() {
             System.out.println("Hello world this is the world we live in");
         }
     };

        Hello h1 = new Hello() {
            @Override
            public void sayhello() {
                System.out.println("Hello world this is the world we live in");
                System.out.println("Hello world this is in");
            }
        };

     h.sayhello();
     h1.sayhello();

     Hello h4 = () -> {
         System.out.println("Hello world this is the world we live in");
         System.out.println("Hello world this is in");
     };

     Hello1 h5 = () -> {
         return "hekowe";
     };

     System.out.println(h5.sayhello());
//        Hashtable;
//        HashSet;
//        LinkedHashSet;
//        TreeSet;
//        HashMap;
//
//        LinkedHashSet
//        LinkedHashSet<Integer> set1 = new LinkedHashSet<>();
        HashSet<Integer> set1 = new HashSet<>();
       Collections.addAll(set1,1100,9,1231231,123123,1);
        System.out.println(set1);
        set1.addAll(set1);


    }
}

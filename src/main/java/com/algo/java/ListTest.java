package com.algo.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;



public class ListTest {

    public static void main(String[] args){
        List<String> seasons = Arrays.asList("Summer","winter","spring","autumn");
//        System.out.println(seasons.getClass().getCanonicalName());
//        seasons.set(0,"really hot season");

        List<String> temp = new ArrayList<>();
        Collections.addAll(temp,"Summer","winter","spring","autumn");
        List<String> unmodifiablelist = Collections.unmodifiableList(temp);
        List<String> immutable = new ArrayList<>();
        Collections.addAll(immutable,"Summer","winter","spring","autumn");
        immutable = Collections.unmodifiableList(immutable);
        System.out.println(immutable);



//        System.out.println(temp);
//        System.out.println(unmodifiablelist);
//        unmodifiablelist.add(0,"changed");
//        System.out.println(temp);
//        System.out.println(unmodifiablelist);



//
//
//        List<String> seasons1 = new ArrayList<>(Arrays.asList("Summer","winter","spring","autumn"));
//        seasons1.add("Hellp");
//        seasons1.set(0,"really hot season");
//        System.out.println(seasons1);
    }

    public static void test(List<String> list) {
        System.out.println(list);
        try{
            list.add("1");
        }
        catch (UnsupportedOperationException e){}

    }
}

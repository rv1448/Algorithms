package com.algo.java;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AppleTest {


    public static void main(String[] args) {
        List<Apple> ll = new ArrayList<>();
        Collections.addAll(ll
                ,new Apple("A",10.0,Apple.Color.RED)
                ,new Apple("B",7.0,Apple.Color.GREEN)
                ,new Apple("C",5.0,Apple.Color.BLUE)
                ,new Apple("D",11.0,Apple.Color.RED)
                ,new Apple("E",12.0,Apple.Color.ORANGE)
        );

        ll.sort(Apple.weightComparator.reversed());

        Collections.sort(ll,(Apple a1, Apple a2) -> a1.getColor().compareTo(a2.getColor()));

        ll.sort(new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return 0;
            }
        });

        System.out.println(ll);
        //Predicate
        Apple.filterapples(ll,(apple -> apple.getColor().equals(Apple.Color.RED)));

        System.out.println(Double.compare(5,6));

        FileFilter filter = new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.toString().contains("U");
            }
        };

        File[] files = new File(".").listFiles(filter);

        File[] files1 = new File(".").listFiles((File file) -> file.toString().contains("U"));
        File[] files2 = new File(".").listFiles((File file) -> file.isHidden());
        File[] files3 = new File(".").listFiles(File::isHidden);

        System.out.println( Apple.filterapples(ll,(apple -> apple.getColor().equals(Apple.Color.RED))));

        for(File file:files)
        {
            System.out.println(file);
        }
    }
}

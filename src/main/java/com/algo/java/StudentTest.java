package com.algo.java;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StudentTest {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(
                Arrays.asList(
                        new Student("kk", 120),
                        new Student("kk", 190),
                        new Student("kk", 220),
                        new Student("kk", 90)
                ));

        students.sort(null);
        System.out.println(students);

       int[] kk =  ThreadLocalRandom.current().ints(1000).toArray();
        Set<Integer> integers = IntStream.of(kk).boxed().collect(Collectors.toSet());
        Set<Integer> integers1 = IntStream.of(kk).boxed().collect(Collectors.toCollection(HashSet::new));

        Set<Integer> klm = new HashSet<>();
        Collections.addAll(klm,1,2,3,4,4,10000,4000001);
        System.out.println(klm);

    }


//    public List<Integer> random(Integer n){
//
//
//    }
}

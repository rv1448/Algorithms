package com.algo.java;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RandomAccessTest {

    public static void main(String[] args) {
        RandomAccess[] rd =  {
                new ArrayList<>(),
                new CopyOnWriteArrayList<>()
        };

        List<Integer> list = IntStream.range(1,1000).mapToObj(Integer::valueOf).collect(Collectors.toList());
        System.out.println(list.getClass().getCanonicalName());
        System.out.println(IntStream.range(1,10).boxed().collect(Collectors.toList()));

        Vector<String> vc = new Vector<>();
        Collections.addAll(vc,"beach","towel","sunscreen","camera");
        Enumeration<String> iter = vc.elements();

        Iterator<String> iterx = vc.iterator();
        while(iterx.hasNext()) System.out.println(iterx.next());
    }
}

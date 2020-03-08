package com.algo.java;

import java.util.*;

@FunctionalInterface
interface Noargs{
    void print();
}

@FunctionalInterface
interface Oneargs{
    void print(String s);
}

@FunctionalInterface
interface multipleargs{
    void print(String s1,String s2);
}

@FunctionalInterface
interface Integerargs{
    void print(List<Integer> s);
}

public class FunctionalSyntax {
    void test(Noargs k){
        k.print();
    }

    List<Integer> sorted(List<Integer> ll, Comparator<Integer> comparator){
        Collections.sort(ll,comparator);
      return  ll;
    }

    public static void main(String[] args) {



        new FunctionalSyntax().test(() -> System.out.println("Hellow"));
        List<Integer> ll = new ArrayList<>(Arrays.asList(10,2,-1,2,3,4,10,12,19));

        Integerargs check  = (kk) -> {
          for (Integer i: kk)  {
              System.out.println(i);
          }
        };

        Integerargs check1 = new Integerargs() {
            @Override
            public void print(List<Integer> s) {
                for (Integer i: s)  {
                    System.out.println(i);
                }
            }
        };
        check1.print(ll);
        check.print(ll);

        new FunctionalSyntax().sorted(ll,(I1,I2) -> I1.compareTo(I2));
        Oneargs one = (String s) -> System.out.println(s);
        one.print("hello");
        System.out.println(ll);


        new FunctionalSyntax().test(() -> {
            System.out.println("Hloowewe");

        });
    }
}

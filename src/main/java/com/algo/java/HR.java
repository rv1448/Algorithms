package com.algo.java;

import java.io.File;
import java.text.NumberFormat;
import java.util.*;
import java.util.function.Consumer;
import java.util.regex.Matcher;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.regex.Pattern;
public class HR {
    private List<Employee> employees = new ArrayList<>();


    public void hire(Employee e) {
        employees.add(e);
    }

    public void layoff(Employee e) {
        employees.remove(e);
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void printEverybody() {
        employees.forEach(System.out::println);
        // foreach takes a consumer; Consumer extends object
    }

    public void payEverybody() {
        for (Employee e : employees) {
            System.out.printf("Paying %s %s%n", e.getName(),
                    NumberFormat.getCurrencyInstance().format(e.getpay()));
        }
    }


    public static void main(String[] args) {
        List<Integer> ll = new ArrayList<>(Arrays.asList(10,3,4,5,6,2,1,5));
        Consumer<Integer> cons = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        };

        List<Integer> x = Stream.of(-3,2,1).collect(Collectors.toList());
        Arrays.asList(new Integer(1),new Integer(2));


        ll.forEach(cons);
        NumberFormat ff = NumberFormat.getInstance();
        System.out.println(ff.getClass());
        File f = new File(".");
        File[] fl = f.listFiles(fk -> {
            return  fk.isHidden();
        });

        for(File f1: fl){
            System.out.println(f1);
        }

        Collections.sort(ll);
        System.out.println(ll);

        new Thread(() -> System.out.println("hellowe")).start();


        Arrays.asList(fl).stream().forEach(System.out::println);
        Stream.of(fl).forEach(System.out::println);

        Arrays.asList(fl).stream().forEach(t ->{
               if (t.toString().contains("a")) System.out.println(t);
                }
        );


        Map<String, Integer> map = new HashMap<>();
        map.put("a",1);
        map.put("b",2);
        map.put("c",3);map.put("d",4);

        map.forEach((k,v) -> System.out.println(k+v));

        // Constructor reference


        Integer[] m =  IntStream.of(10,100,12,1231).map(t -> t+1).boxed().toArray(Integer[]::new);
        Integer[] m1 =  Stream.of(10,100,12,1231).map(t -> t+1).toArray(Integer[]::new);

//        List<Apple> names = Arrays.asList(
//                new Apple("a1",10.0, Apple.Color.RED),
//                new Apple("a2",11.2, Apple.Color.ORANGE),
//                new Apple("a3",12.0, Apple.Color.PINK),
//                new Apple("a4",13.0, Apple.Color.RED),
//                new Apple("a5",14.0, Apple.Color.RED)
//        );

        List<String> names = Arrays.asList("a1","a2","a3","a4","a5","a6");
        names.stream().map(Apple::new).collect(LinkedList::new,LinkedList::add,LinkedList::addAll);

        System.out.println(Stream.of(1,2,3,4).mapToLong(e -> e).getClass());
        int lasd = Stream.of(1,2,3,4).reduce((p,y) -> p+y).get();
        Stream.of(1,2,3,4).peek(System.out::println);
        List<String> kk = Stream.of(1,2,3,4)
                .map(String::valueOf)
                .collect(ArrayList::new,ArrayList::add,ArrayList::addAll);
        System.out.println(kk);

        List<String> masd = Arrays.asList("hellowe","kasd","asdasd");
        Collections.sort(masd,(s1,s2) -> s1.length() - s2.length());

           new Thread(() -> System.out.println("asdasd")).start();

        IntStream.of(10,100,12,1231).map(t -> t+1).boxed().toArray(Integer[]::new);
        Stream.of("heloowe","ettes").sorted();

//        Arrays.asList("this","is",null,"then",null,"how")
//                .stream()
//                .filter(t -> t.length() > 1)
//                .forEach(System.out::println);
        Arrays.asList("this","is",null,"then",null,"how")
                .stream();

        System.out.println(Integer.MIN_VALUE);
        Integer max = Stream.of(3,1,4,1,5,9).reduce(Integer.MIN_VALUE,Integer::max);
        System.out.println(max);

        NumberFormat in = NumberFormat.getCurrencyInstance(new Locale("en","IN"));
        System.out.println(in.format(12324.134).toString());



        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat india = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        double payment = 12324.134;
        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + india.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));

        Pattern p = Pattern.compile("d{2,3}.d{2,3}.d{2,3}.d{2,3}");
        Pattern p1 = Pattern.compile("(\\d{2,3}).(\\d{2,3}).(\\d{2,3}).(\\d{2,3})");
        Matcher k  = p1.matcher("123.123");
        System.out.println(k.matches());
        System.out.println("123.123".matches("(\\d{2,3}[0-255]).(\\d{2,3}[0-255])"));

        System.out.println("123".matches("(\\d[1-2]\\d[1-5]\\d[1-5])"));
        System.out.println("he is?".split("\\s").toString());
        String[] kms = "he is?".split("\\S");
        System.out.println(Arrays.toString(kms));
    }
}
package com.algo.java;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;
public class StreamTest {

    public static void main(String[] args) {
        int[] integers = new int[]{100,-1,-2,90,110,49,51};
        Random rand = new Random(100);
        rand.nextInt(10);
        for(int i = 0;i<20;i++){
            System.out.println(rand.nextInt(10));
        }


        Arrays.stream(new int[]{100,-1,-2,90,110,49,51}).map(i -> i*i).forEach(i -> System.out.println(i));

        System.out.println("Hellow");

        IntStream xyz = Arrays.stream(new int[]{100,-1,-2,90,110,49,51});
        Stream<Integer> klasda =  xyz.filter(i -> i> 1).mapToObj(i -> Integer.valueOf(i));

//        Stream<Integer> iw =  xyz.filter(i -> i> 1).mapToObj(i -> Integer.valueOf(i));
//        Stream<Integer> iwx =  xyz.filter(i -> i> 1).mapToObj(Integer::valueOf);
        Object[] iasd = klasda.toArray();
        System.out.println(iasd);

        HashSet<Movie> movies = new HashSet<>();
        Collections.addAll(movies
                ,new Movie("Toy story",1999,4.7)
                ,new Movie("Schitt Creek",2019,4.0)
                ,new Movie("Creek",2020,4.0)
                ,new Movie("Troy",2000,3.7)
                ,new Movie("story",1999,1.7)
                ,new Movie("Nimo",2005,2.7)
        );

        Predicate<Movie> filter = new Predicate<Movie>() {
            @Override
            public boolean test(Movie movie) {
                return movie.getRating() > 3;
            }
        };

        Stream<Movie> filtermovie = movies.stream().filter(filter);

        movies.stream().sorted(Comparator.comparing(Movie::getRating).thenComparing(Movie::getYear)).forEach(System.out::println);

//        filtermovie.forEach(i -> System.out.println(i));
//         Movie movie = new Movie("asd",1999,7.7);
//        System.out.println(movie);


    }


}


class Movie{
    String name;
    Integer year;
    Double rating;

    public Movie(String name, Integer year, Double rating) throws IllegalArgumentException {
        this.name = name;
        this.year = year;

        if (rating >= 0.0 && rating <=5.0){this.rating = rating;}
        else{ new IllegalArgumentException(" rating value is not in the limits");}

    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", rating=" + rating +
                '}';
    }

    public String getName() {
        return name;
    }

    public Integer getYear() {
        return year;
    }

    public Double getRating() {
        return rating;
    }
}

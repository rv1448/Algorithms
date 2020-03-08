package com.algo.java;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Apple {
    String name;
    double weight;
    Color color;
    enum Color
    {
        RED, GREEN, BLUE, ORANGE,PINK, NOCOLOR;
    }

    Apple (String name){
        this.name = name;
        this.weight = 0.0;
        this.color = Color.NOCOLOR;
    }
    static Comparator<Apple> weightComparator = new Comparator<Apple>(){
        @Override
        public int compare(Apple o1, Apple o2) {
            return Double.compare(o1.weight,o2.weight);
        }
    };
    static List<Apple> filterapples(List<Apple> apples, Predicate<Apple> t){
        List<Apple> result = new ArrayList<>();
        result = apples.stream().filter(t).collect(Collectors.toList());
        return result;
    }

    public Apple(String name, double weight, Color color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", color=" + color +
                '}';
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }
    public Color getColor() {
        return color;
    }
}


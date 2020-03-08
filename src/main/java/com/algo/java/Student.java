package com.algo.java;

import java.util.Comparator;

public class Student<o2> implements Comparable<Student> {

    String name;
    int iq;

    final Comparator<Student> NATURAL = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            int result = Integer.compare(o1.iq, o2.iq);
            return (result== 0) ? o1.name.compareTo(o2.name) : result;
        }
    };

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", iq=" + iq +
                '}';
    }

    public Student(String name, int iq) {
        this.name = name;
        this.iq = iq;
    }


    public String getName() {
        return name;
    }


    public int getIq() {
        return iq;
    }

    @Override
    public int compareTo(Student that) {
        int result = Integer.compare(this.iq, that.iq);
        if (result != 0) return -result;
        return this.name.compareTo(that.name);

    }
}

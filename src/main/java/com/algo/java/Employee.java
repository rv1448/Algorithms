package com.algo.java;

import java.time.LocalDate;

public abstract class Employee {

    public static final String DEFAULT_NAME = "UNKNOWN";
    public static int nextid;


    String name;
    int id;
    LocalDate hiredate;

    public Employee(){
        this(DEFAULT_NAME);
    }

   public Employee(String name){
        this.id = nextid++;
        this.name = name;
        hiredate = LocalDate.now();
    }

    public abstract double getpay();


    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public LocalDate getHiredate() {
        return hiredate;
    }



    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setHiredate(LocalDate hiredate) {
        this.hiredate = hiredate;
    }

    @Override
    public String toString() {
        return String.format("Employee{" +
                "name='" + name + '\'' +
                ", hiredate=" + hiredate +
                '}');
    }
}

package com.algo.java;

public class Salaried extends Employee {
    public static final double DEFAULT_SALARY = 12000;
    private  double salary = DEFAULT_SALARY;

    public Salaried(){
    super();
    }

    public Salaried(String name){
        this(name,DEFAULT_SALARY);
    }


    public Salaried(String name, double salary){
       super(name);
       this.salary = salary;
    }

    @Override
    public double getpay() {
        return 0;
    }

    public static void main(String[] args) {
        Salaried s2 = new Salaried();
        System.out.println(s2.salary);
        System.out.println(s2.name);
        System.out.print(s2.id);

        Employee e1 = new Employee("RV") {
            @Override
            public double getpay() {
                return 0;
            }
        };

        System.out.println(e1.name);

    }
}

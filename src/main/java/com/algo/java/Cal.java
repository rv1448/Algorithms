package com.algo.java;

import sun.util.calendar.CalendarSystem;
import sun.util.calendar.Gregorian;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import static java.util.Calendar.OCTOBER;

public class Cal {

    void cal(int year){
//        Gregorian b = CalendarSystem.getGregorianCalendar();
//        Calendar c = Calendar.getInstance();
//        c.set(2018,);
//        c. = 2018;
        //LocalDate c = LocalDate.of(2017,Month.APRIL);
        Calendar c = new GregorianCalendar();
        c.set(Calendar.YEAR,2017);
        c.set(Calendar.MONTH,9);
        c.set(Calendar.WEEK_OF_MONTH,2);
        c.set(Calendar.DAY_OF_WEEK,Calendar.TUESDAY);
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
//    System.out.println( c.get(Calendar.DAY_OF_MONTH));
//        System.out.println( c.get(Calendar.OCTOBER));
//        System.out.println( Calendar.OCTOBER);
    }


    void pullz(){
        List<List<Integer>> a = new ArrayList<List<Integer>>();

    }

    public static void main(String[] args) {
        new Cal().cal(2017);
    }

}

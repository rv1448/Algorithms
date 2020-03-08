package com.algo.hackerrank;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;

public class JavaDate {



    String findDay(int year, int month, int day){



           return LocalDate.of(year,month,day).getDayOfWeek().toString();

    }


    public static void main(String[] args) {
        System.out.println(new JavaDate().findDay(2011,11,11));
    }
}

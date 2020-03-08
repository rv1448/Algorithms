package com.algo.java;

import java.math.BigInteger;
import java.util.stream.IntStream;

public class Factorial {
    public static BigInteger f(int n){

        return IntStream.rangeClosed(0,n)
                .mapToObj(BigInteger::valueOf)
                .reduce(BigInteger.ONE, BigInteger::multiply);
    }

}

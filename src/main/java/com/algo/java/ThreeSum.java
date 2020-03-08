package com.algo.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ThreeSum {
    public ThreeSum() {
    }

    int threesum(int[] var1) {
        int var2 = 0;
        int var3 = var1.length;
        int var4 = 0;

        for(int var5 = 0; var5 < var3; ++var5) {
            for(int var6 = var5 + 1; var6 < var3; ++var6) {
                ++var4;

                for(int var7 = var6 + 1; var7 < var3; ++var7) {
                    System.out.println(String.format("i: %d, j: %d, k: %d, Iter: %d", var5 + 1, var6 + 1, var7 + 1, var4));
                    if (var1[var5] + var1[var6] + var1[var7] == 0) {
                        ++var2;
                    }
                }
            }
        }

        return var2;
    }

    public static void main(String[] var0) throws FileNotFoundException {
        ThreeSum var1 = new ThreeSum();
        int var2 = var1.threesum(new int[]{1, 2, 3, -5, 10, -20});
        System.out.println(var2);
        FileInputStream var3 = new FileInputStream("/Users/RahulReddy/Desktop/Datastructures_Algorithms/UF.txt");
        Scanner var4 = new Scanner(var3);

        while(var4.hasNext()) {
            System.out.println(var4.next());
        }

    }
}
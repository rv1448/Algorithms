package com.algo.java;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

/***
 * Object: Array with connected components
 */
public class UnionFind {
    int[] obj;
    int len;

    UnionFind(int a){
        obj = new int[30];
        len  = obj.length;
        for(int i = 0; i< len;i++){
            obj[i] = i;
        }
    }

    void Union(int a, int b) throws Exception {
        if(a > len-1|| b > len-1){
            throw new Exception("Out of Boundry");
        }


    }


    @Override
    public String toString(){
        return Arrays.toString(this.obj);
    }

    public static void main(String[] args){
        UnionFind test1 = new UnionFind(10);
//        System.out.println(Arrays.toString(test1.obj));
        System.out.println(test1);

    }

}

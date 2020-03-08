package com.java.test;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.*;
import java.net.*;
import java.net.URISyntaxException;
import java.util.Arrays;

public class Filetest {


    public static void main(String[] args) throws IOException {
//       OutputStream out = new FileOutputStream("/Users/RahulReddy/Desktop/Datastructures_Algorithms/UF3.txt");
//
//        out.write("1234".getBytes());
//        out.flush();
//        out.close();

        Thread t = new Thread();
        t.start();


        InputStream in = new FileInputStream("/Users/RahulReddy/Desktop/Datastructures_Algorithms/UF3.txt");
        byte[] input = new byte[1024];
        int k = in.read(input,0,1024)  ;
//        while (  k != -1  ){
//            System.out.println(k);
//            k = in.read();
//        }
        System.out.println(Arrays.toString(input));
        //System.out.println(Arrays.toString("`12315674657857869098-=0".getBytes()));

    }
}

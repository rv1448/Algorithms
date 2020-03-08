package com.algo.java;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CiperText {

//    0 - 25
//    3 - 28
    // 65 -90
    //63 - 98
    public static void main(String[] args) {
       String s =  "ABCDEFWXYZ";
                  //DEFGHIZBCD
                  //CDEFGHYZAB
                  //ABCDEFWXYZ
       int len = s.length();
       int count = 0;
       StringBuilder Ciperedtext = new StringBuilder();
       int CiperBlock = 3;
       while (count < len){

           int inter = (int)s.charAt(count)+CiperBlock;
           int m = inter > 90 ?  inter%90+64 : inter;


           Ciperedtext.append((char) m);

           count++;
       }
        System.out.println(Ciperedtext);
        String string = "ABCDEFWXYZ";
          string.chars().map(i -> i > 90? i%90+64: i);
          Stream<Character> kk = string.chars().map(i -> i+3).map(i -> i > 90? i%90+64: i).mapToObj(i -> (char)i);
        System.out.println(kk.collect(Collectors.toList()));


    }
}

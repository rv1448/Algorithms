package com.algo.java;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class StackExprParser {
    char[] Expr;

    StackExprParser(String expr){
        Expr = expr.toCharArray();
    }

    @Override
    public String toString(){
        return Arrays.toString(Expr);
    }


    int evaluate(char[] expr){
        for(int i= 0;i<expr.length;i++){
            char c = expr[i];
            if( c=='(');



            i++;
        }

        return  1;
    }

    public static void main(String[] args) {
        /**
         *  (1 +((2+3) * (4 * 5)))
         */
        StackExprParser s1 = new StackExprParser("(1+((2+3)*(4*5)))");
        System.out.println(s1);
    }
}

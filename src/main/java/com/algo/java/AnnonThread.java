package com.algo.java;

public class AnnonThread extends Thread {


    @Override
    public void run(){
        System.out.println("Thread annoymous");
    }


    public static void main(String[] args) {
         Thread thread = new Thread(){
             @Override
             public void run(){
                 System.out.println("hello");
             }
         };
         thread.run();

         AnnonThread t = new AnnonThread();
         t.start();
         Thread tt = new Thread(t);
         tt.start();

         Thread tt1 = new Thread(() -> {
             System.out.println("Hwaear");
         });
         tt1.start();


    }
}

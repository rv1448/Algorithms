package com.algo.java;

public class Mythread implements Runnable{
    private int i;
    private Thread thread = new Thread(this);
    public  Mythread(int i){
        this.i = i;
    }

    public  void start(){
        thread.start();
    }
    @Override
    public void run(){
        System.out.println(Thread.currentThread().toString()+i);
    }

}


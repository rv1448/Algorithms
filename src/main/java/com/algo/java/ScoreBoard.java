package com.algo.java;

import java.util.Arrays;

public class ScoreBoard {
    int NumofEntries;
    GameEntry[] board;
    int lenghtofboard;
    int[] array;

    public ScoreBoard(int maxofEntries) {
         this.board = new GameEntry[maxofEntries];
         this.lenghtofboard = maxofEntries;
         this.array = new int[maxofEntries];

    }
    void add(GameEntry g){
        int newScore = g.getScore();

        if(NumofEntries < lenghtofboard || newScore > board[NumofEntries-1].getScore()){
            if(NumofEntries < lenghtofboard) NumofEntries++;
        }

        int j = NumofEntries -1;
        while (j> 0 && board[j-1].getScore() < newScore){
            board[j] = board[j-1];
            j--;
        }
        board[j] = g;


    }

     void add1(int i){

        /*
         *NumofEntries = 1
         *
          */
       if(NumofEntries < lenghtofboard || array[NumofEntries-1] < i){
           if(NumofEntries < lenghtofboard)NumofEntries++;
       }
         /*
          *NumofEntries = 2
          * j = 1
          */
       int j = NumofEntries-1;
       while (j > 0 && array[j-1] < i){
           array[j] =array[j-1];
           j--;
       }
       array[j] = i;
     }

    @Override
    public String toString(){
      // return Arrays.toString(board);
        return Arrays.toString(array);
    }

    public static void main(String[] args) {

        ScoreBoard sc = new ScoreBoard(3);
//        sc.add(new GameEntry("a",10));
//        sc.add(new GameEntry("a",11));
//        sc.add(new GameEntry("a",12));
//        sc.add(new GameEntry("a",13));
//        sc.add(new GameEntry("a",14));

        sc.add1(10);
        sc.add1(11);
        sc.add1(12);
        sc.add1(13);
        sc.add1(14);
        sc.add1(15);
        sc.add1(16);

        System.out.println(sc);

    }


}




class GameEntry{
    String name;
    int score;

    public GameEntry(String name, Integer score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "GameEntry{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}

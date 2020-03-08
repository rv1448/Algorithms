package com.algo.java;

public class StackOfStringLinkList {
    Node first = null;

    class Node{
        String data;
        Node node;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public void push(String item){
        Node oldfirst = first;
        first = new Node();
        first.data = item;
        first.node = oldfirst;
    }

    public String pop(){
        if(!isEmpty()) {
            String item = first.data;
            first = first.node;
            return item;
        }
        return null;
    }


    public static void main(String[] args) {
        StackOfStringLinkList st = new StackOfStringLinkList();
        st.push("a");
        st.push("b");
        st.push("c");
        st.push("d");
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
    }
}

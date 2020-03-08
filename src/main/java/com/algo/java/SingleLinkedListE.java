package com.algo.java;

public class SingleLinkedListE<E> {

    Node<E> head;
    Node<E> tail;
    int size;

    public SingleLinkedListE(E element) {
        Node<E> e = new Node(element);
        this.head = e;
        this.tail = e;
        size++;
    }


    class Node<E>{
        private E element;
        private Node<E> next;


        public Node(E element) {
            this.element = element;
        }

        public Node<E> getNext() {
            return next;
        }

        public E getElement() {
            return element;
        }
    }


}

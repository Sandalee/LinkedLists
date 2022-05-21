package com.company;

public class LinkedList {
    private class Node {
        private int value;
        private Node next;

        //constructor
        public Node(int value){
            this.value=value;
        }
    }

    private Node first;
    private Node last;

    //addFirst
    public void addFirst(int item){

    }
    //addLast
    public void addLast(int item){
        //wrapper for int ~ node object
        var node = new Node(item);

        //if empty
        if (first == null){
            first=node;
            last=node;
        }
        else {
            //add after the last node
            last.next=node;
            last=node;
        }

    }
    //deleteFirst
    //deleteLast
    //contains
    //indexOf
}

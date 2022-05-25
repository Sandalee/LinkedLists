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
    //private because its implementation detail
    private boolean isEmpty(){
        return first==null;
    }
    public void addFirst(int item){
        var node = new Node(item);
        if (isEmpty()){
            first=node;
            last=node;
            // first = last = node;
        }
        else{
            node.next=first;
            first=node;
        }

    }
    //addLast
    public void addLast(int item){
        //wrapper for int ~ node object
        var node = new Node(item);

        //if empty
        if (isEmpty()){
            first=node;
            last=node;
        }
        else {
            //add after the last node
            last.next=node;
            last=node;
        }

    }
    //indexOf
    public int indexOf(int item){
        int index=0; //to keep track of the items
        var current=first;
        while(current != null){
            if (current.value == item) return index;
            current=current.next;
            index++;
        }
        return -1;

    }
    //deleteFirst
    public void removeFirst(){
        // [10->20->30]
        var second=first.next;
        first.next=null; //remove the link btwn 10 & 20
        first=second;
    }
    //deleteLast
    //contains
    public boolean contains(int item){
        return indexOf(item) != -1;
    }
    //
}

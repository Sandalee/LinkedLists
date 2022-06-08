package com.company;

import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;

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
    private int size;

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
        size++;

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

        size++;

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
        if (isEmpty())
            throw new NoSuchElementException();

        //1 element
        if (first==last)
            first=last=null;
        //return;

        // [10->20->30]
        var second=first.next;
        first.next=null; //remove the link btwn 10 & 20
        first = second;
        size--;
    }
    //deleteLast
    public void removeLast(){
        if (isEmpty())
            throw new NoSuchElementException();

        if(first==last) {
            first = last = null;
        }
        else {
            var prev = getPrevious(last);
            last = prev;
            last.next = null;
        }

        size--;

    }

    private Node getPrevious(Node node){
        var current=first;
        while(current != null){
            if (current.next == node) return current;
            current=current.next;

        }
        return null;
    }
    //contains
    public boolean contains(int item){
        return indexOf(item) != -1;
    }
    //size
    public int size(){
        //not practical to travverse through the list
        //when the list is ~1mill etc
        //hence the private field 'size'
        return size;

    }

    //convert list to an array
    public int[] toArray(){
        int[] array=new int[size];
        var current=first;
        var index=0;
        while(current != null){
            array[index++]=current.value;
            //index++;
            current=current.next;
        }
        return array;
    }

    //reverse the list - excercise -16
    public void reverse(){
        if (isEmpty()) return;
        // f       l
        //[10->20->30]
        // p   c   n
        //     p   c  n
        //         p  c  n ( c=null)
        // n= c.next
        // c.next=p
        var prev = first;
        var current = first.next;

        while (current != null){
            var next=current.next;
            current.next=prev; //swap

            //increment pg
            prev=current;
            current=next;
        }

        last=first;
        last.next=null;
        first=prev;

    }
}

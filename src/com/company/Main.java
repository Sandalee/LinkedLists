package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(20);
        list.addLast(80);
        list.addFirst(10);
        list.removeFirst();
        list.removeLast();
        System.out.println(list.indexOf(20));
        System.out.println(list.contains(40));


    }
}

package com.company;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addFirst(5);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.contains(20));
        System.out.println(list.indexOf(20));
        var array=list.toArray();
        System.out.println(Arrays.toString(array));
    }
}

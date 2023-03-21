package com.tutorial.wildcards;

import java.util.ArrayList;
import java.util.List;

public class Unbounded {
    public static void printList(List<?> list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("World");

        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(2);
        ints.add(3);

        printList(strings);
        printList(ints);
    }
}

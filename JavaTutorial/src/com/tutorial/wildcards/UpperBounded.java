package com.tutorial.wildcards;

import java.util.ArrayList;
import java.util.List;

public class UpperBounded {
    public static double sum(List<? extends Number> list) {
        double sum = 0.0;
        for (Number n : list) {
            sum += n.doubleValue();
        }
        return sum;
    }
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(2);
        ints.add(3);

        double sum = sum(ints);
        System.out.println("Sum: " + sum);
    }
}

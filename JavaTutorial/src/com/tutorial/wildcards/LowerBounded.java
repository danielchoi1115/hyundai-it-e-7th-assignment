package com.tutorial.wildcards;

import java.util.ArrayList;
import java.util.List;

public class LowerBounded {
    public static void addIntegers(List<? super Integer> list) {
        list.add(1);
        list.add(2);
        list.add(3);
    }

    public static void main(String[] args) {
        List<Number> nums = new ArrayList<>();
        nums.add(4.0);
        nums.add(5.0);
        nums.add(6.0);

        addIntegers(nums);
        System.out.println("Numbers: " + nums);
    }
}


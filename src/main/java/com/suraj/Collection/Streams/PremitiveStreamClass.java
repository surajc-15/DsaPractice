package com.suraj.Collection.Streams;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class PremitiveStreamClass {
    public static void main(String[] args) {
        int[] numbers={1,2,3,4,5};
        // Using IntStream to process primitive int array
        IntStream sum = Arrays.stream(numbers);
        System.out.println(IntStream.range(1,5).boxed().collect(Collectors.toList()));
        System.out.println(IntStream.rangeClosed(1,5).boxed().collect(Collectors.toList()));

        DoubleStream doubles =new Random().doubles(5,10,20);
        System.out.println(doubles.boxed().toList());
    }
}

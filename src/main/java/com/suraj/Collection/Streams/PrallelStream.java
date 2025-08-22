package com.suraj.Collection.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class PrallelStream {
    public static void main(String[] args) {
        //Parallel stream different threads are used to process the elements of the stream
        //Parallel streams can improve performance for large datasets by utilizing multiple CPU cores
        //Example: Using parallel stream to process a list of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3,4, 5, 6, 7, 8, 9, 10);
        List<Integer> list= Stream.iterate(1,x->x+1).limit(20000).toList();
        long starttime = System.currentTimeMillis();
        List<Long> factorials=list.stream().map(PrallelStream::factorial)
                .toList();
        long endtime = System.currentTimeMillis();

        System.out.println("Time taken to calculate factorials using sequential stream: " + (endtime - starttime) + " ms");


        // Using parallel stream to calculate factorials
        starttime = System.currentTimeMillis();
        List<Long> parallelFactorials = list.parallelStream().map(PrallelStream::factorial)
                .toList();
        endtime = System.currentTimeMillis();
        System.out.println("Time taken to calculate factorials using parallel stream: " + (endtime - starttime) + " ms");

        //prallel stream can be used to process large datasets more efficiently
        //Parallel streams can be beneficial for CPU-intensive tasks, such as mathematical computations or data processing
        //However, they may not always be faster for smaller datasets or tasks that involve I/O
        //It's important to benchmark and test the performance of parallel streams for specific use cases

        AtomicInteger sum = new AtomicInteger(0);
        list.parallelStream().map(sum::addAndGet).toList();
        System.out.println("Sum of numbers using parallel stream: " + sum.get());


    }

    private static long factorial(Integer integer) {
        long result=1;
        while(integer-->0){

            result *= integer;
        }
        return result;
    }
}

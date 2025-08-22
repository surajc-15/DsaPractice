package com.suraj.Collection.Streams;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsDEmo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Suraj", "Rohit", "Amit", "Sanjay", "Ravi");

        //1.Collection to List
        List<String> nameList = names.stream().filter(name -> name.startsWith("S")).collect(java.util.stream.Collectors.toList());
        System.out.println("Names starting with 'S': " + nameList);

        //2.Collection to Set
        ArrayDeque<String> nameSet = names.stream().distinct().collect(Collectors.toCollection(() -> new ArrayDeque<>()));
        System.out.println("Distinct names in ArrayDeque: " + nameSet);

        //3.Collection to Map
        var nameMap = names.stream().collect(Collectors.toMap(name -> name, name -> name.length()));
        System.out.println("Names and their lengths: " + nameMap);

        //4.Collection to String
        String nameString = names.stream().collect(Collectors.joining(", ", "Names: ", "."));
        System.out.println(nameString);

        //5.Collection to Count
        long count = names.stream().count();
        System.out.println(count);


        //Intsummation
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        IntSummaryStatistics stats = numbers.stream().collect(Collectors.summarizingInt(x -> x));
        System.out.println("Count" + stats.getCount());
        System.out.println("Sum: " + stats.getSum());
        System.out.println("Min: " + stats.getMin());
        System.out.println("Max: " + stats.getMax());
        System.out.println("Average: " + stats.getAverage());

        long num = names.stream().filter(name -> name.length() == 4).count();
        System.out.println("Number of names with length 4: " + num);

        //6. Grouping by length
        var groupedByLength = names.stream().collect(Collectors.groupingBy(String::length));
        System.out.println("Names grouped by length: " + groupedByLength);

        //7. Partitioning by length
        var partitionedByLength = names.stream().collect(Collectors.partitioningBy(name -> name.length() > 4));
        System.out.println("Names partitioned by length > 4: " + partitionedByLength);

        //8. counting
        long countByLength = names.stream().collect(Collectors.counting());
        System.out.println("Total number of names: " + countByLength);


    }
}

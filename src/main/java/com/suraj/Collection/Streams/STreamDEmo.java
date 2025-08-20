package com.suraj.Collection.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class STreamDEmo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Suraj", "Saurabh", "Suman", "Sumanth", "Sumanth", "Sumanth");
        int count = 0;
        // Using Stream to filter names that start with 'S' and collect them into a new list
        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).startsWith("S")) {
                count++;
            }
        }
        System.out.println("Count of names starting with 'S': " + count);

        //uaing Stream API to filter names that start with 'S' and collect them into a new list
        System.out.println(names.stream().filter(name -> name.startsWith("S")).count());

        //===================================================================//
        //Stream Creation
        //1.using the stream Interfacew
        Stream<String> stream = names.stream();

        //2.using array or from arrays
        String[] nameArray = {"Suraj", "Saurabh", "Suman", "Sumanth"};
        Stream<String> streamFromArray = Arrays.stream(nameArray);

        //3.using Stream.of() method
        Stream<String> streamOf = Stream.of("Suraj", "Saurabh", "Suman", "Sumanth");

        //4.using Stream.generate() method
        Stream<String> streamGenerate = Stream.generate(() -> "Suraj").limit(5);

        //5.using Stream.iterate() method
        Stream<Integer> streamIterate = Stream.iterate(1, n -> n + 1).limit(5);

        //===================================================================//
        //Stream Operations
        //1. Intermediate Operations
        List<String> filteredNames = names.stream()
                .filter(name -> name.startsWith("S"))
                .collect(Collectors.toList());
        System.out.println("Filtered Names: " + filteredNames);

        //Filtering stream
        Stream<String> filteredStream = names.stream().filter(name -> name.startsWith("S"));
        System.out.println("Filtered Stream: " + filteredStream.collect(Collectors.toList()));

        //2.Map Operation
        Stream<String> stringStream=names.stream().map(String::toUpperCase);
        System.out.println("Mapped Stream: " + stringStream.collect(Collectors.toList()));

        //3.Sorted Operation
        Stream<String> sortedStream = names.stream().sorted();
        System.out.println("Sorted Stream: " + sortedStream.collect(Collectors.toList()));

        //4. Distinct Operation
        Stream<String> distinctStream = names.stream().distinct();
        System.out.println("Distinct Stream: " + distinctStream.collect(Collectors.toList()));

        //5. Limit Operation
        Stream<String> limitedStream = names.stream().limit(3);
        System.out.println("Limited Stream: " + limitedStream.collect(Collectors.toList()));

        //6. Skip Operation
        Stream<String> skippedStream = names.stream().skip(2);
        System.out.println("Skipped Stream: " + skippedStream.collect(Collectors.toList()));

        //===================================================================//
        //Terminal Operations
        //1. forEach Operation
        names.stream().forEach(name -> System.out.println("Name: " + name));

        //2. Collect Operation
        List<String> collectedNames = names.stream().collect(Collectors.toList());
        System.out.println("Collected Names: " + collectedNames);

        //3. Count Operation
        long countOfNames = names.stream().count();
        System.out.println("Count of Names: " + countOfNames);

        //4. Find First Operation
        String firstName = names.stream().findFirst().orElse("No Names");
        System.out.println("First Name: " + firstName);

        //5. Find Any Operation
        String anyName = names.stream().findAny().orElse("No Names");
        System.out.println("Any Name: " + anyName);

        //6. Reduce Operation
        String concatenatedNames = names.stream().reduce("#", (a, b) -> a +
                b);
        System.out.println("Concatenated Names: " + concatenatedNames);

        //7. Min and Max Operations
        String minName = names.stream().min(String::compareTo).orElse("No Names");
        System.out.println("Min Name: " + minName);
        String maxName = names.stream().max(String::compareTo).orElse("No Names");
        System.out.println("Max Name: " + maxName);


    }
}

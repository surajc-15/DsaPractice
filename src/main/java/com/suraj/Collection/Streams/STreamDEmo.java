package com.suraj.Collection.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.suraj.Collection.Streams.StreamsPreREquisite.logger;

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
        logger.info("Terminal Operations on Stream");
        //1. forEach Operation
        names.stream().forEach(name -> System.out.println("Name: " + name));

        //2. Collect Operation
        Set<String> collectedNames = names.stream().collect(Collectors.toSet());
        List<String> collectedList = names.stream().collect(Collectors.toList());
        System.out.println(names.stream().toList());
        System.out.println("Collected List: " + collectedList);
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
        String concatenatedNames = names.stream().reduce("", (a, b) -> a +
                b);
        System.out.println("Concatenated Names: " + concatenatedNames);

        //7. Min and Max Operations
        String minName = names.stream().min(String::compareTo).orElse("No Names");
        System.out.println("Min Name: " + minName);
        String maxName = names.stream().max(String::compareTo).orElse("No Names");
        System.out.println("Max Name: " + maxName);


        //8. Any Match, All Match, None Match Operations
        boolean anyMatch=names.stream().anyMatch(name-> name.startsWith("S"));
        System.out.println("Any Match: " + anyMatch);

        boolean allMatch=names.stream().allMatch(name-> name.startsWith("S"));
        System.out.println("All Match: " + allMatch);

        boolean noneMatch=names.stream().noneMatch(name-> name.startsWith("A"));
        System.out.println("None Match: " + noneMatch);
        //===================================================================//

        //Example :Squaring and Sorting a List of Integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> squaredSortednumbers=numbers.stream().map(num->num*num).sorted().toList();
        System.out.println("Squared and Sorted Numbers: " + squaredSortednumbers);

        //Example:Sum of values
        int sum =numbers.stream().reduce((x,y)-> x+y).orElse(0);
        System.out.println("Sum of Numbers: " + sum);

        //Example:Sum of values using map
        int sum2=numbers.stream().reduce(Integer::sum).get();
        System.out.println(sum2);

        //until and unless the stream is consumed, the operations are not executed.
        //This is known as lazy evaluation.
        //The stream operations are executed only when a terminal operation is invoked.
        //===================================================================//

        //Statefull and stateless operation
        //Stateful operations are those that require the entire input to be processed before producing output.
        //Examples include sorting, distinct, and limit operations.
        //Stateless operations are those that can be processed independently of the entire input.
        //Examples include filter, map, and forEach operations.
        //In the above code, operations like sorted, distinct, and limit are stateful,
        //while operations like filter, map, and forEach are stateless.
        //===================================================================//
        //Example: Comparing performance of Stream vs Parallel Stream
        List<Integer> bigList = new java.util.Random()
                .ints(10_000_000, 1, 100)
                .boxed()
                .collect(Collectors.toList());

        // Sequential Stream
        long startSequential = System.currentTimeMillis();
        long sequentialCount = bigList.stream()
                .filter(n -> n % 2 == 0)
                .count();
        long endSequential = System.currentTimeMillis();
        System.out.println("Sequential Stream count: " + sequentialCount +
                ", Time: " + (endSequential - startSequential) + " ms");

        // Parallel Stream
        long startParallel = System.currentTimeMillis();
        long parallelCount = bigList.parallelStream()
                .filter(n -> n % 2 == 0)
                .count();
        long endParallel = System.currentTimeMillis();
        System.out.println("Parallel Stream count: " + parallelCount +
                ", Time: " + (endParallel - startParallel) + " ms");

        // Results are the same, but parallel stream may be faster for large datasets.
        // Note: Performance gain depends on CPU cores and workload.
        //Example: Parallel Stream
        //Parallel streams allow for parallel processing of data, which can improve performance for large datasets.
        //Parallel streams can be created using the parallelStream() method on a collection.
        //Note: Parallel streams should be used with caution, as they can introduce complexity and may not always yield performance benefits,
        //especially for small datasets or operations that are not CPU-bound.
        logger.info("Parallel Stream Example");
        List<String> parallelNames = Arrays.asList("Suraj", "Saurabh", "Suman", "Sumanth");
        List<String> parallelFilteredNames = parallelNames.parallelStream()
                .filter(name -> name.startsWith("S"))
                .collect(Collectors.toList());
        System.out.println("Parallel Filtered Names: " + parallelFilteredNames);
        

    }
}

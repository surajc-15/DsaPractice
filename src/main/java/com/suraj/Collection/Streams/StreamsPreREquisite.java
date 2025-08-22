package com.suraj.Collection.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class StreamsPreREquisite {
    static final Logger logger=Logger.getLogger(StreamsPreREquisite.class.getName());
    public static void main(String[] args) {
        // Example usage of Streams in Java
        // This is a placeholder for your stream operations
        // You can add your stream processing logic here
        System.out.println("Streams Practice Example");

        // Example: Create a simple stream and print numbers from 1 to 10
        java.util.stream.IntStream.rangeClosed(1, 10)
                .forEach(System.out::println);

        Consumer<Integer> printConsumer =(x)-> System.out.println("Number: " + x);
        printConsumer.accept(200);

        // You can also use method references
        for(int i=0; i<10; i++) {
            printConsumer.accept(i);
        }
        logger.warning("Warning: This is a warning message");
        //Function Interface
        //(input datatype ,return datatype)
        Function<Integer,Integer> squareFunction = (x) -> x * x;
        Integer squaredNumber=squareFunction.apply(5);
        logger.info("Squared Number: " + squaredNumber);

        // Example of using a stream to process a list of integers
        ArrayList<Integer> numbers= new ArrayList<>();
        for(int i=1; i<=10; i++) {
            numbers.add(i);
        }
        numbers.stream().filter(x -> x % 2 == 0)
                .forEach(x -> System.out.println("Squared even number: " + x));

        Function<Integer,Integer> cubeFunction = (x) -> x * x * x;
        System.out.println("Cube of 3: " + cubeFunction.apply(3));
        System.out.println(squareFunction.andThen(cubeFunction).apply(2)); // Applying square then cube
        System.out.println(cubeFunction.compose(squareFunction).apply(2)); // Applying cube then

        // Suplier Interface
        Supplier<Integer> randomSupplier = () -> (int) (Math.random() * 100);
        System.out.println("Random Number: " + randomSupplier.get());

        Predicate<Integer> predicate= x->x*3>10;
        Function<Integer,Integer> function=x->x*x;
        Consumer<Integer> consumer = x-> System.out.println("Consumer: " + x);
        Supplier<Integer> supplier =()->100;

        if(predicate.test(supplier.get())){
            consumer.accept(function.apply(supplier.get()));
        }

        // Bipredicate Example
        BiPredicate<Integer,Integer> biPredicate = (x, y) -> x + y > 10;
        BiFunction<Integer, Integer, Integer> biFunction = (x, y) -> x * y;
        BiConsumer<Integer, Integer> biConsumer = (x, y) -> System.out.println(x + " + " + y + " = " + (x + y));

        //UnaryOperator ,Binary Operator
        UnaryOperator<Integer> a=x -> x ^ 10;
        BinaryOperator<Integer> b = (x, y) -> x + y;

        System.out.println("Unary Operator Result: " + a.apply(5));
        System.out.println("Binary Operator Result: " + b.apply(5, 10));

        System.out.println("=============================================");
        List<String> students=Arrays.asList("Ram","Shyam","Hari","Sita","Gita");
        students.forEach(student-> System.out.println(student));

        ArrayList<String> newdata = (ArrayList<String>) students.stream()
                .map(student -> student.toUpperCase()).collect(Collectors.toList());

        System.out.println("Uppercase Students: " + newdata);

    }
}
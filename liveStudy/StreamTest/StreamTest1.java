package liveStudy.StreamTest;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest1 {

    public static void main(String[] args){

//        List<Integer> list = Arrays.asList(0,1,2,3,4,5,6,7,8,9,10);
//
//        Stream<Integer> stream1 = list.stream().distinct();  // 7, 5, 1 ,2, 3, 4, 6
//        Stream<Integer> stream2 = list.stream().filter( e -> e % 2 ==0);  // 2, 4, 6
//
//
//
//        stream2.forEach( x -> System.out.println(x)
//        );

//        List<String> list = Arrays.asList("Java", "Kotlin", "Scala");
//
//        Stream<Integer> stream1 = list.stream().map(String::length);  // 4 , 6 ,5
//        Stream<String> stream2 = list.stream().map(String::toUpperCase); // JAVA , KOTLIN, SCALA
//
//
//
//
//        stream2.forEach( x -> System.out.println(x)
//        );

//        List<List< Integer >> list = Arrays.asList(Arrays.asList(1, 3), Arrays.asList(4,2));
//
//        List<Integer>   flatMapStream = list.stream().flatMap(Collection::stream).collect(Collectors.toList());
//
//        flatMapStream.stream().forEach(x -> System.out.println(x)); // 1, 3, 4, 2

//        IntStream stream = IntStream.range(0, 10);
//
//        Stream<Integer> stream1 = (Stream<Integer>) stream.limit(5); // 0,1,2,3,4
//        Stream<Integer> stream2 = (Stream<Integer>) stream.skip(3); // 3,4,5,6,7,8,9
//        Stream<Integer> stream3 = (Stream<Integer>) stream.skip(3).limit(5); //3,4,5,6,7


        List<String> list = Arrays.asList("Java", "C", "Python", "Kotlin", "Go");
//
        list.stream().sorted()
                .collect(Collectors.toList())
                .get(0);
//                .forEach(x -> System.out.println(x)); // C , Go , Java , Kotlin , Python



//        list.stream().anyMatch()
//
//
//        list.stream().sorted(Comparator.reverseOrder())
//                .collect(Collectors.toList())
//                .forEach(x -> System.out.println(x)); // Python , Kotlin, Java, Go, C
//
//        list.stream().sorted(Comparator.comparingInt(String::length))
//                .collect(Collectors.toList())
//                .forEach(x -> System.out.println(x)); // C , Go , Java  , Python, Kotlin

        IntStream stream = IntStream.range(0 , 10);

        stream.peek(System.out :: print)
                .sum();

    }
}

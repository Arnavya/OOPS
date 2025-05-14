package lld1.streams;

import java.util.List;

public class LazyEvaluation {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6);

        list.stream()
                .map(n -> {
                    System.out.println("I am Doubling "+ n);
                    return n*2;
                })//I pick an element & I say {..} is the func that u have to execute. So in the new stream it will return 1*2,2*2,...
                .filter( n -> {
                    System.out.println("Filtering "+n);
                    return n>5;
/*
        Filter is not returning a value.It always takes a condition and return if it is true or not for
        that element & on that it decided whether it has to pick that element or not.
         */
                })
                .forEach(System.out::println);

        System.out.println("Order of map ã filtering reversed");
        list.stream()
                .filter(n -> {
                    System.out.println("Filtering "+n);
                    return n>5;
                })
                .map(n -> {
                    System.out.println("I am Doubling "+n);
                    return n*2;
                })
                .forEach(System.out::println);
    }
}
/*
    Map & Filter are applied only when an element is needed by foreach.
    Order of map and filter would impact how many elements are being processed.

    Think of a convear belt & elements as stars in the convear belt: The convear belt will only be
    activated when there is something to print.Elements will be moved and printed only by one after
    passing through map and filter.
    Source---*--*->[map]--*--*-->[filter]--*--->Print.
 */

/*Chat-GPT
Java Streams are lazily evaluated. That means:
* Intermediate operations are just declared pipelines.
* Nothing happens until a terminal operation (like forEach, collect, count, etc.) is called.
*The terminal operation pulls data through the stream,triggering execution of the intermediate operations.
 */
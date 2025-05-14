package lld1.streams;

import java.util.ArrayList;
import java.util.List;

public class LazyEvaluationSecondExample {
    public static void main(String[] args) {
        //We want to understand the effect of lazy evaluation on performance.
        List<Integer> largeNumber = new ArrayList<>();
        for(int i=1;i<=100;i++){
            largeNumber.add(i);
        }

        largeNumber.stream()
                .filter(n -> {
                    System.out.println(n);
                    try {
                        Thread.sleep(50);//Simulating an expensive operation.
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    return n%2==0;
                })
                .limit(5)//limits output to first 5 matches.
                .forEach(System.out::println);
    }
}
/*
*Java streams are lazily evaluated, meaning intermediate operations (like filter)
are only executed when there's a terminal operation (forEach, collect, etc.).

*Because of short-circuiting behavior of limit(),
the stream stops processing once 5 even numbers are found.

*So, although the original list has 100 elements, not all of them are passed through the filter.
* It's not that the filter itself stops after reaching 10
— it's that the stream processes elements one-by-one in pull mode,
and once 5 even numbers have been passed to forEach, no more elements are requested or filtered.

* Relate from convear belt example before:
For convear belt to keep moving Terminal operation(PRINT) has to be active.

* In Streams if there is no terminal operation the intermediate operations will not execute at all.



 */
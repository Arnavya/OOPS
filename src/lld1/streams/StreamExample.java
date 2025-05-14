package lld1.streams;

import lld1.Collections.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        //forEach in Streams

        List<Integer> numbers = List.of(1,2,3,4,5);

        //normally this is how we traverse a list.
        for(Integer i : numbers){
            System.out.println(i);
        }

        //Using streams
        Stream stream = numbers.stream();
        stream.forEach(System.out::println);//Print 1,2,3,4,5

        //This fails because the stream is already exhausted.Convear best over, products moved.
        //stream.forEach(System.out::println);
        /*
There are 2 types of operations we can do on streams.
1. Terminal operation - End
2. Intermediate operations -

forEach is a terminal operation and it is called in the end and it completes the Stream.
It consumes the Stream and does an action with each and every element.(Eg. printing the elements)
 */
        //Filter - Intermediate operation
        numbers.stream()//1,2,3,4,5
                .filter(x -> x%2==0)
                .forEach(System.out::println);//2,4

        System.out.println("Try printing numbers greater than 2 and odd numbers and print them using forEach");
        numbers.stream()
                .filter(x -> (x>2)&&((x&1)==1))
                .forEach(System.out::println);
        //We can write filter multiple times.

        System.out.println("Double every element in the stream and print");
        // map -> transform each element
        numbers.stream()
                .map(x -> x*2)
                .forEach(System.out::println);

        //Q) Write a stream code to turn a list of words in uppercase.
        List<String> lowerCase = List.of("Arnavya","Naresh","Abhishek","Anubhav");
        System.out.println("Words in upper case");
        lowerCase.stream()
                .map(s -> s.toUpperCase())
                .forEach(n -> System.out.println(n));

        //Chaining the operations
        numbers.stream()
                .filter(x -> x%2==0)
                .map(x -> x*6)
                .forEach(System.out::println);

        List<Student> students = new ArrayList<Student>();
        students.addAll(
                List.of(
                        new Student(1,21,"Arnavya",100),
                        new Student(2,20,"Naresh",90),
                        new Student(3,21,"Anubhav",85),
                        new Student(4,21,"Abhishek",95)
                )
        );
        students.stream()
                .filter(s -> s.getPsp()>90)
                .forEach(s -> System.out.println(s.getName()));

    }
}


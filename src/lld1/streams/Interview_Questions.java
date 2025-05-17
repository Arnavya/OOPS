package lld1.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.*;
import java.util.stream.Stream;

public class Interview_Questions {
    public static void main(String[] args) {
        /*
        Q1) Given a list of integers,
        find out all the even numbers that exist in the list using Stream functions?
         */
        List<Integer> list = List.of(10,15,8,49,25,98,32);
        List<Integer> ans = new ArrayList<>();
        list.stream()
                .filter(x -> {
                   return x%2==0;
                })
                .forEach(x -> {
                    ans.add(x);
                });
        System.out.println(ans);
        ///////////////////////////////////////////////////////

        //Q2) Given a list of integers, find out all the numbers starting with 1 using Stream functions?
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
        List<Integer> ans1 = new ArrayList<>();
        myList.stream()
                .filter(s -> {
                    return s.toString().charAt(0)=='1';
                })
                .forEach(ans1::add);

        System.out.println(ans1);
        ///////////////////////////////////////////////////////

        //Q3) How to find duplicate elements in a given integers list in java using Stream functions?
        List<Integer> duplicates = Arrays.asList(10,15,8,49,25,98,98,32,15);
        HashSet<Integer> set = new HashSet<>();
        List<Integer> ans2 = new ArrayList<>();

        duplicates.stream()
                .filter(x ->{
                    if(set.contains(x)){
                        return true;
                    }
                    else{
                        set.add(x);
                        return false;
                    }
                })
                .forEach(x -> {
                   ans2.add(x);
                });
        System.out.println(ans2);
        /////////////////////////////////////////////////////////////
        //Q4) Given the list of integers, find the first element of the list using Stream functions?
        List<Integer> list1 = Arrays.asList(10,15,8,49,25,98,98,32,15);
        list1.stream()
                .limit(1)
                .forEach(System.out::println);
        //////////////////////////////////////////////////////////////
        //Q5)Given a list of integers,
        //   find the total number of elements present in the list using Stream functions?
        List<Integer> list2 = Arrays.asList(10,15,8,49,25,98,98,32,15);
        int[] count = {0};
        list2.stream()
                .forEach(x -> {
                    count[0]++;
                });
        System.out.println(count[0]);
        /*
Why int[] count = {0}; works in a lambda and int count = 0; doesn't
This works because:
* count (the variable) is effectively final — you're not reassigning the reference to another array.
* You're modifying the contents of the array (count[0]), not the reference itself.

Java’s lambda rule is:
You can modify the state of an object captured by a lambda,
but you cannot reassign the local variable reference.
         */
        //////////////////////////////////////////////////////////////////

    //Q6)Given a list of integers, find the maximum value element present in it using Stream functions?
        List<Integer> list3 = Arrays.asList(10,15,8,49,25,98,98,32,15);
        //M1
        int[] max = {list.get(0)};
        list3.stream()
                .forEach(x -> {
                    if(x>max[0]) max[0]=x;
                });
        System.out.println(max[0]);

        //M2
        int max1 = list3.stream()
                .max(Integer::compare)
                .get();
        System.out.println(max1);
        ///////////////////////////////////////////////
        //Q7) Given a String, find the first non-repeated character in it using Stream functions?
        String input = "Java articles are Awesome";
        Character result = input.chars() // Stream of String
                .mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s))) // First convert to Character object and then to lowercase
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) //Store the chars in map with count
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1L)
                .map(entry -> entry.getKey())
                .findFirst()
                .get();
        System.out.println(result);
        ////////////////////////////////////////////////////

        //8) Given a String, find the first repeated character in it using Stream functions?
        String input1 = "Java Articles are Awesome";

        Character result1 = input1.chars() // Stream of String
                .mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s))) // First convert to Character object and then to lowercase
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) //Store the chars in map with count
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1L)
                .map(entry -> entry.getKey())
                .findFirst()
                .get();
        System.out.println(result1);
        ////////////////////////////////////////////////////////////
        //9) Given a list of integers, sort all the values present in it using Stream functions?
        List<Integer> list4 = Arrays.asList(10,15,8,49,25,98,98,32,15);

        list4.stream()
                .sorted()
                .forEach(System.out::println);
        ///////////////////////////////////////////////////////////////
        // 10)Given a list of integers, sort all the values present in it in descending order using Stream functions?
        List<Integer> list5 = Arrays.asList(10,15,8,49,25,98,98,32,15);

        list5.stream()
                .sorted(Collections.reverseOrder())
                .forEach(System.out::println);
        //////////////////////////////////////////////////////////////////
        //11)Given an integer array nums, return true if any value appears at least twice in the array,
        // and return false if every element is distinct.
        int[] nums = {1,2,3,4,5};
        List<Integer> list6 = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toList());
        Set<Integer> set1 = new HashSet<>(list);
        if(set1.size() == list6.size()) {
            System.out.println(false);
        }
        System.out.println(true);
        //////////////////////////////////////////////////////////////////
        //12)How will you get the current date and time using Java 8 Date and Time API?
        System.out.println("Current Local Date: " + java.time.LocalDate.now());
        //Used LocalDate API to get the date
        System.out.println("Current Local Time: " + java.time.LocalTime.now());
        //Used LocalTime API to get the time
        System.out.println("Current Local Date and Time: " + java.time.LocalDateTime.now());
        //Used LocalDateTime API to get both date and time
        //////////////////////////////////////////////////////////////////
        //13) Write a Java 8 program to concatenate two Streams?
        List<String> list7 = Arrays.asList("Java", "8");
        List<String> list8 = Arrays.asList("explained", "through", "programs");

        Stream<String> concatStream = Stream.concat(list7.stream(), list8.stream());

        // Concatenated the list1 and list2 by converting them into Stream

        concatStream.forEach(str -> System.out.print(str + " "));

        // Printed the Concatenated Stream
        //////////////////////////////////////////////////////////////////////////////
        //14) Java 8 program to perform cube on list elements and filter numbers greater than 50.
        List<Integer> integerList = Arrays.asList(4,5,6,7,1,2,3);
        integerList.stream()
                .map(i -> i*i*i)
                .filter(i -> i>50)
                .forEach(System.out::println);
        /////////////////////////////////////////////////////////////////////////////
        //15) Write a Java 8 program to sort an array and then convert the sorted array into Stream?
        int arr[] = { 99, 55, 203, 99, 4, 91 };
        Arrays.parallelSort(arr);
        // Sorted the Array using parallelSort()

        Arrays.stream(arr).forEach(n > System.out.print(n + " "));
        /* Converted it into Stream and then
           printed using forEach */
    }
}
package lld1.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();

        students.addAll(
                List.of(
                        new Student(1,21,"Arnavya",100),
                        new Student(2,20,"Naresh",90),
                        new Student(3,21,"Anubhav",85),
                        new Student(4,21,"Abhishek",95)
                )
        );
        List<String> strings = new ArrayList<>();
        strings.addAll(List.of("Arnavya","Naresh","Abhishek"));
        Collections.sort(strings);
        Collections.sort(students);
/*
If you want to sort items based on a different parameter
or different order from the natural ordering --> COMPARATOR.

 */
    }
}

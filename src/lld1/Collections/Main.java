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

        //Using the natural ordering defined in Student class(Desc order of PSP)
        Collections.sort(students);

        //Custom ordering defined in ASC order of name.
        Collections.sort(students,new StudentOrderingByName());
/*
If you want to sort items based on a different parameter
or different order from the natural ordering --> COMPARATOR.

default/natural ordering => Comparable --> method to implement(comparedTo())
Custom ordeing => Comparable --> method to implement(Compare()).

 */

/*
Difference b/w comparator and comparable:
Comparable is used to define the natural ordering of elements.It has a method called comparedTo()
which we need to implement.
Comparator is used to define a custom ordering of the elements & we have to implement a compare method.
 */
    }
}

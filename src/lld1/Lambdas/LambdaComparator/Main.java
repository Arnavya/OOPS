package lld1.Lambdas.LambdaComparator;

import lld1.Collections.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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

        //V2
        Comparator<Student> comparator = (o1,o2) -> {
            if(o1.getPsp()==o2.getPsp()) return 0;
            if(o1.getPsp()>o2.getPsp()) return -1;
            else return 1;
        };
        Collections.sort(students,comparator);

        //V3
        Collections.sort(students, (o1,o2) -> {
                if(o1.getId()==o2.getId()) return 0;
                if(o1.getId()>o2.getId()) return 1;
                else return -1;
        });
    }
}

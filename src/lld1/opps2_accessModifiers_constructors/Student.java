package lld1.opps2_accessModifiers_constructors;

public class Student {
    int rollNo;
    String name;
    int rank;

    void printDetails(){
        System.out.println("Student details : ");
        System.out.println("Roll No : " + rollNo);
        System.out.println("Student Name : " + name);
        System.out.println("Student Rank : "+ rank);
    }
}
//.java --> .class --> bytecode --> runs
//Main.java --> Main.class --> bytecode --> runs

//new keyword is used when we want to allocate memory.
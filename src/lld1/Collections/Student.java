package lld1.Collections;

public class Student implements Comparable<Student>{
    private int id;
    private int age;
    private String name;
    private double psp;
    public Student(int id, int age, String name,double psp) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.psp = psp;
    }
    public int getId() {
        return id;
    }
    public int getAge(){
        return age;
    }
    public String getName() {
        return name;
    }
    public double getPsp() {
        return psp;
    }

    //We want to have the natural ordering of a LeaderBoard.--> One with more Psp comes fist.
    @Override
    public int compareTo(Student other) {
        if(this.getPsp()==other.getPsp()) return 0;
        if(this.getPsp()>other.getPsp()) return -1;
        else return 1;
    }
    /*
    The comparison is b/w this and other,(this<-->other)
    <0 --> current object is smaller than the other object.-->Order| this ..... other |
    =0 --> both students are equal. Order |this .... other| or | other .... this |
    >0 --> current object is greater than the other object. Order |other ..... this |.

     */
}

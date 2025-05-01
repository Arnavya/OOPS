package lld1.opps2_accessModifiers_constructors.inheritence;

//extends is a keyword in java that is used to create child class.
public class Instructor extends User{
    String batchName;
    double avgRating;
    void scheduleClass(){
        System.out.println("Scheduled a new class.....");
    }
}

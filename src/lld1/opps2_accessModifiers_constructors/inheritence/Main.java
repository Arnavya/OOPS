package lld1.opps2_accessModifiers_constructors.inheritence;

public class Main {
    public static void main(String[] args) {
        Instructor instructor = new Instructor();

        //specific to instructor class
        instructor.batchName = "AP Batch";
        instructor.avgRating = 4.9;
        instructor.scheduleClass();

        //inherited from the parent class(User)
        instructor.username = "Arnavya";
        instructor.login();
    }
}

package lld1.Generics.tripletExample;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Triplet<String> idNameEmail = new Triplet<>(
                "1",
                "Arnavya",
                "arnavyachettri@gmail.com"
        );
        Triplet<Integer> idAgeRollno = new Triplet<>(
                1,
                21,
                9
        );
        Triplet<Long> idAgeRollnoLong = new Triplet<>(
                1L,
                21L,
                9L
        );
        print(idNameEmail);
        print(idAgeRollno);

        //List
        List<Triplet<String>> list = List.of(idNameEmail,idNameEmail);
        printList(list);

        //Get Average
        System.out.println("The average is "+getAverage(idAgeRollno));
        System.out.println("The average is "+getAverage(idAgeRollnoLong));
        //System.out.println("The average is "+getAverage(idNameEmail));//Cant be passed as String is not a child class of Number.
    }
    public static <TYPE> void print(Triplet<TYPE> triplet){
        System.out.println(
                triplet.getLeft()+"------"+
                        triplet.getMiddle()+"------"+
                        triplet.getRight()
        );
    }
    public static <E> void printList(List<Triplet<E>> list){
        for(Triplet<E> triplet : list){
            System.out.println(
                    triplet.getLeft()+"------"+
                            triplet.getMiddle()+"------"+
                            triplet.getRight()
            );
        }
    }
    // ? -> is a wild card
    //We calculate Avg of Numbers
    //Integer,Long,Double,Short,Byte,Float

    //Number class is the parent of all the classes allowing numeric values.
    //getAverage should be allowing Triplet of type Number or child classes of Number.
    public static Double getAverage(Triplet<? extends Number> triplet){
        return (triplet.getLeft().doubleValue()+
                triplet.getMiddle().doubleValue()+
                triplet.getRight().doubleValue())/3;
    }
     /*
     Difference b/w bounds and wildcards
     bounds:Use bounds when you are defining a generic.You provide restriction in the method signature only.
     wildcards: wildcard is used where you are consuming a Generic.
     Eg of wildcard:I am calling this particular func and this particular func
     is going to consume the generic & it says that I can accept anything that you give me.
      */

    /*
    GENERIC BOUNDS AND WILDCARDS BRIEF:
    Generic Bounds and Wildcards are used in the same service itself.Think of it like what are bounds, Bounds are saying that I am designing a genric type <T>
    to be flexible but it must be a subclass of Number, I need this structure throughout the class or method.On the other hand wildcard is saying that I am not
    defining a new structure, I just need to work with this generic object in a flexible way, I don't care what exact type it is as long as it meets my constraint.
     */
}
 
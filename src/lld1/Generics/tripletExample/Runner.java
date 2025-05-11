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
}

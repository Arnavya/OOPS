package lld1.Generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        Pair p1 = new Pair(1,"Hi");//Integer,String
        Pair p2 = new Pair(2L,"Hello");//Long,String
        Pair p3 = new Pair(2.0,4.0);
        List<Pair> list = List.of(p1,p2,p3);
        for(Pair p : list){
            String first = (String) p.getFirst();
            String second = (String) p.getSecond();
        }
        //Pro: You get to store generics
        //Cons: There is no compile time safety.

        //When we run this and try to typecast Long into String it will give us runtime type safety error.
        //As during compilation everything looks fine getFirst() gets type casted to String-->as Object can be typecasted to String.
        //and gets stored in a variable of type String.But during runtime it will realize that
        //p.getFist() is of type Long and Long can't be typecasted to String.
        //Soln:-> Use Generics
        */


        //Generics
        Pair1<Integer,String> pair1 = new Pair1<>(1,"Hi");
        Pair1<Double,Double> pair2 = new Pair1<>(2.0,4.0);
        Pair1<Long,Boolean> pair3 = new Pair1<>(1l,true);

        List<Pair1> pair1List = List.of(pair1,pair2,pair3);
         //String first = (String) pair1.getFirst();-->giving tycasting error in compile time.

         //Here we get typecast error in compile time which we prefer instead of getting it in runtime.
        //Reason: Previously Object->String as Object can be typecasted to String.
        // The compiler knew that p.getFirst() return an object but it doesn't know that it of type Integer.
        //In the runtime it gets to know that the object is of type Integer and Integer can't be typecasted to String.

        //But when we use generics we get to know the type in compile time only and resolving them.
        // Preventing errors in runtime.
        Integer first = pair1.getFirst();//Proper way to define.
        System.out.println(first);
        List<Integer> l1 = List.of(1,2,3);
        List list = List.of("HI","Hello");


        //Raw Type
        Pair1 pair4 = new Pair1(1l,"Hi");
        pair4.getFirst();//It's returning Object type-> because it's using the raw type for it.
        //Implementation of Genrics before java 5 was using the Object type for all the datatypes.

        //Genric examples
        Demo<Integer,String> demo = new Demo<>();
        demo.doSomething(1,"Hi");

        String s = Demo.<String,Integer>getValue("Hello",2);
        System.out.println(s);

        System.out.println(Demo.<Double,String>getValue(1.0,"Name"));
    }
}

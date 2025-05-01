package lld1.opps2_polymorphism_interfaces.polymorphism_inheritence;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        A a = new B();
        //1) Parent can hold the child -- Parent variable can hold the child object
        a.name = "Arnavya";// parent can access properties of parent.
        //a.uniName = "SST";// X
        //2) But parent variable cannot access the properties specific to child object.-->Objects are created during runtime.
        //>reason: compiler relies on the datatype of the variable.--Compiler doesn't know which object will be created during runtime.
        //On the other hand runtime relies on the actual object created.(example meathod overriding).So it will call the actual objects methods.

        //Eg for why this is the case in java
        A a1 = getObject();
        System.out.println(a1);
        // as a1 can be either B or C therefore parent is not allowed to access child specific attributes.



        //B b = new A(); Child cannot hold the parent object
        //Because parent can of diffrent types
    }
    public static A getObject(){
        Random rand = new Random();
        int num = rand.nextInt(10);
        if((num&1)==1) return new B();
        else return new C();
    }
}

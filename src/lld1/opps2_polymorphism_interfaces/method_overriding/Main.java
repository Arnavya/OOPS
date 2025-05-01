package lld1.opps2_polymorphism_interfaces.method_overriding;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        a.doSomething("anything");

        a = new B();
        a.doSomething("anything");


    }
}

//The objects are created during runtime.We cannot know during the compile time which object will be called.
//That's why it is runtime polymorphism.At runtime it is figured out that whose method is called.

//Give me an example of runtime polymorphism--> Method Overriding.
//The method that is executed is of the data type that is actually present at the time of the code
//and not of the type of the variable.Eg: A a = new B().
//If the method is present in B.It will execute the method of B and not of A type.

//NOTE: Compiler relies on the data type of the variable.Runtime relies on the actual object created.

/*Comdition for Methos overrding:
1)Inheritance must be involved-->eg: B extends A.
2)Same method signature-->NameOfMethod(DataType of para).
3)Return type must be the same or covariant(the return type in the subclass can be a child (subclass) of the return type in the superclass).
4)The access modifier of the subclass method must not be more restrictive than the one in the superclass.
5)Method must not be static, final, or private.
6)Both methods must belong to different classes (parent-child)
7)Subclass method cannot throw broader checked exceptions than the superclass method.


 */
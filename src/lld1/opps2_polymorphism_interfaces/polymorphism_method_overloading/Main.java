package lld1.opps2_polymorphism_interfaces.polymorphism_method_overloading;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        a.hello();
        a.hello("Arnavya");
    }
}
//Can you give me an example of compile time polymorphism?-->Method Overloading.
//Methods are known to be overloaded when they have same name but different method different method signature.
// Method Signature--> NameOfMethod(Data type of parameter)

//During compile time the compiler knows which method to be called.

//Method overloading doesn't happen b/w child and parent classes.
//Method overloading only happens when you are in the same class.
package lld1.opps2_polymorphism_interfaces.interfaces.Example;

public class Main {
    public static void main(String[] args) {
        Animal A = new Cat();
        A.run();
    }
}

//As java supports polymorphism:
//A reference variable of interface type can hold an object of any class that implements it.
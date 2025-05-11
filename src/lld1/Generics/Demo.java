package lld1.Generics;

import lld1.opps2_accessModifiers_constructors.inheritence.Instructor;

public class Demo <K,V>{
    public void doSomething(K key, V value){
        System.out.println(key);
        System.out.println(value);
    }
    public static<F,S> F getValue(F key,S value){
        System.out.println(key);
        System.out.println(value);
        return key;

    }
}

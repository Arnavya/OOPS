package lld1.Generics;

public class Pair {
    Object first;
    Object second;
    public Pair(Object first, Object second) {
        this.first = first;
        this.second = second;
    }
    public Object getFirst() {
        return first;
    }
    public Object getSecond(){
        return second;
    }
}
/*
Pro:You get to store (generics)->different types of parameters.
Cons:There is no compile time safety.

Having an object as the time doesn't guarantee compile time safety.We never want runtime error.
When we run this and try to typecast Long into string it will give us runtime type safety error.
It's always better to get the error in compile time(compile time type safety error) than in runtime(runtime type safety error).
 */
package lld1.Generics;

public class Pair1<F,S> {
    F first;
    S second;
    public Pair1(F first, S second) {
        this.first = first;
        this.second = second;
    }
    public F getFirst() {
        return first;
    }
    public S getSecond() {
        return second;
    }
}
/*
Pros:Have different types of parameters
Runtime safety, by showing errors during compile time.
Generics allows you to define a class with parameterised data types of attributes that are not fixed.
 */
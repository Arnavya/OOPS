package lld1.opps2_polymorphism_interfaces.interfaces.Stack_imp.Array;

import lld1.opps2_polymorphism_interfaces.interfaces.Stack_imp.Stack;

public class ArrayStack implements Stack {
    int[] arr = new int[10];
    int s =-1;

    @Override
    public int pop() {
        if(s==-1) return -1;
        return arr[s--];
    }

    @Override
    public void push(int val) {
        if(s==arr.length-1) arr[s] = val;
        else arr[++s] = val;
    }

    @Override
    public boolean isEmpty() {
        if(s==-1) return true;
        return false;
    }

    @Override
    public int peek() {
        if(s==-1) return -1;
        else return arr[s];
    }
}

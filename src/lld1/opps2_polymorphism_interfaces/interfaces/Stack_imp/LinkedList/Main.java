package lld1.opps2_polymorphism_interfaces.interfaces.Stack_imp.LinkedList;

import lld1.opps2_polymorphism_interfaces.interfaces.Stack_imp.Stack;

public class Main {
    public static void main(String[] args) {
        Stack st = new LLStack();
        for(int i=1;i<=20;i++){
            st.push(i);
        }
        System.out.println(st.peek());
        System.out.println(st.isEmpty());
        while(!st.isEmpty()){
            System.out.print(st.pop()+"<--");
        }
        System.out.println(st.isEmpty());
    }
}

package lld1.opps2_polymorphism_interfaces.interfaces.Stack_imp.Array;

import lld1.opps2_polymorphism_interfaces.interfaces.Stack_imp.Stack;

public class Main {
    public static void main(String[] args) {
        Stack st = new ArrayStack();
        for(int i=1;i<10;i++){
            st.push(i);
        }
        for(int i=1;i<10;i++){
            System.out.print(st.pop()+"<--is empty ");
            System.out.println(st.isEmpty());
        }
        for(int i=5;i<=9;i++){
            st.push(i);
        }
        while(!st.isEmpty()){
            System.out.print(st.pop()+"<--");
        }
    }
}

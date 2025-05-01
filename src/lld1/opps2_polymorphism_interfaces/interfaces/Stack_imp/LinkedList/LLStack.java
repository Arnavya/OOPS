package lld1.opps2_polymorphism_interfaces.interfaces.Stack_imp.LinkedList;

import lld1.opps2_polymorphism_interfaces.interfaces.Stack_imp.Stack;

public class LLStack implements Stack {
    ListNode head;
    ListNode tail;
    int count;
    int size = 10;

    @Override
    public int pop() {
        if(head==null) return -1;
        else{
            int temp = head.val;
            head = head.next;
            count--;
            return temp;
        }
    }

    @Override
    public void push(int val) {
        ListNode temp = new ListNode(val);
        if(count>=size) pop();
        if(head==null) tail = temp;
        temp.next = head;
        head = temp;
        count++;
    }

    @Override
    public boolean isEmpty() {
        if(head==null) return true;
        return false;
    }

    @Override
    public int peek() {
        if(head==null) return -1;
        return head.val;
    }
}

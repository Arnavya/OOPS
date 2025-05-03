package lld1.Intro_to_Threads;

public class Main {
    public static void main(String[] args) {
        //Printing number from 1 to 100 using multi threading.

        //M!: Implements Runnable Interface
        for(int i=0;i<=100;i++){
            Runnable r = new NumberGenerator1(i);
            Thread t = new Thread(r);
            t.start();
        }

        //M2:Extending Thread Class
        for(int i=0;i<=100;i++){
            Thread t = new NumberGenerator2(i);
            t.start();
        }
    }
}
/* Implement Runnable vs Extending Thread
Since you can only inherit 1 class, using it to inherit Thread class,
will not be the best use of inheritance.
Implementing Runnable is better, as my business logic is seperate from Thread related things.

Me don't want to inherit the attributes and behaviours of Thread class which is not need.
We want our class to be as light as possible.-->One of design principles.

 */
package lld1.Lambdas.AdderSubtractor;

import lld1.AtomicDataTypes.Subtractor;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Count count = new Count();

        //Lambda
        /*
        1. Creates an anonymous class -> adderLambdaAnonymous
        2. It will implement the interface Runnable in the Anonymous class it created
        3. It will pass all the variables being shared
        4. It will copy the code form the Lambda body into the method we implemented in the
        anonymous class.
        5.And this Lambda will return an object of this anonymous class which will we stored in the
        runnable(adderLambda)
         */

        Runnable adderLambda = () -> {
            for(int i=1;i<=1000;i++){
                synchronized(count){
                    count.val+=i;
                }
            }
        };

        Runnable subtractorLambda = () -> {
            for(int i=1;i<=1000;i++){
                synchronized(count){
                    count.val-=i;
                }
            }
        };

        Thread t1 = new Thread(adderLambda);
        Thread t2 = new Thread(subtractorLambda);
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(count.val);
    }
}

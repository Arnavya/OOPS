package lld1.synchronization.adderSubtractorMutex;

import lld1.synchronization.adderSubtractor.Subtractor;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Count count = new Count();
        Lock lock = new ReentrantLock();
        Runnable adder = new Adder(count,lock);
        Runnable subtractor = new subtractor(count,lock);
        Thread t1 = new Thread(adder);
        Thread t2 = new Thread(subtractor);
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(count.val);
    }
}

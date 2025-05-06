package lld1.synchronization.adderSubtractor;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Count count = new Count();
        Runnable adder = new Adder(count);
        Runnable subtractor = new Subtractor(count);
        Thread t1 = new Thread(adder);
        Thread t2 = new Thread(subtractor);
        t1.start();
        t2.start();

        // This waits for thread t1 & t2 to finish execution.
        t1.join();
        t2.join();

        System.out.println(count);
        System.out.println(count.val);

    }
}

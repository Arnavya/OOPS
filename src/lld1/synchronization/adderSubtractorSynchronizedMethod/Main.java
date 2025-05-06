package lld1.synchronization.adderSubtractorSynchronizedMethod;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Count count = new Count();
        Runnable adder = new Adder(count);
        Runnable subtractor = new Subtractor(count);
        Thread adderThread = new Thread(adder);
        Thread subtractorThread = new Thread(subtractor);
        adderThread.start();
        subtractorThread.start();
        adderThread.join();
        subtractorThread.join();
        System.out.println(count.getVal());
    }
}
//Synchronized method is a way to prevent client from needing to handle concurrency.
package lld1.synchronization.adderSubstractorSynchronized;

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
        System.out.println(count.val);
    }
}
//Note:Ideally use synchronized keyword when there is only 1 shared variable b/w multiple threads.
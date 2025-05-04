package lld1.executor_callable;

public class NumberPrinter implements Runnable {
    int n;
    public NumberPrinter(int n) {
        this.n = n;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ": " + n);
    }
}

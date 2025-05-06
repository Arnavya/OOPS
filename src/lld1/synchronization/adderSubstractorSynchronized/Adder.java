package lld1.synchronization.adderSubstractorSynchronized;

public class Adder implements Runnable {
    Count count;
    public Adder(Count count) {
        this.count = count;
    }
    @Override
    public void run() {
        for (int i = 0; i < 100; i++){
            synchronized(count){
                count.val+=i;
            }
        }
    }
}

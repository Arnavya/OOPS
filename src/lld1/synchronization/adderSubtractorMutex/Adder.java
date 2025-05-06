package lld1.synchronization.adderSubtractorMutex;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable {
    Count count;
    Lock lock;
    public Adder(Count count,Lock lock) {
        this.count = count;
        this.lock = lock;
    }
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            lock.lock();
            count.val+=i;
            lock.unlock();
        }
    }
}

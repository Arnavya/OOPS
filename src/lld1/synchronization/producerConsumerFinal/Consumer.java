package lld1.synchronization.producerConsumerFinal;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Consumer implements Runnable {
    Queue<Object> store;
    String name;
    Semaphore producerSemaphore;
    Semaphore consumerSemaphore;
    public Consumer(Queue<Object> store, String name,Semaphore producerSemaphore,Semaphore consumerSemaphore) {
        this.store = store;
        this.name = name;
        this.producerSemaphore = producerSemaphore;
        this.consumerSemaphore = consumerSemaphore;
    }
    @Override
    public void run() {
        while(true) {
            try {
                consumerSemaphore.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            store.remove();
            System.out.println(this.name+"--> Remove an element: "+store.size());
            producerSemaphore.release();
        }
    }
}

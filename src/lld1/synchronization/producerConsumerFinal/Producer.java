package lld1.synchronization.producerConsumerFinal;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Producer implements Runnable{
    Queue<Object> store;
    String name;
    Semaphore producerSemaphore;
    Semaphore consumerSemaphore;
    public Producer(Queue<Object> store,String name,Semaphore producerSemaphore,Semaphore consumerSemaphore) {
        this.store = store;
        this.name = name;
        this.producerSemaphore = producerSemaphore;
        this.consumerSemaphore = consumerSemaphore;
    }
    @Override
    public void run() {
        while(true){
            try {
                producerSemaphore.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            store.add(new Object());
            System.out.println(this.name+"--> Add an element: "+store.size());
            consumerSemaphore.release();
        }
    }
}

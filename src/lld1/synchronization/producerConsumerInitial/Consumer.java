package lld1.synchronization.producerConsumerInitial;

import java.util.Objects;
import java.util.Queue;

public class Consumer implements Runnable {
    private Queue<Object> store;
    private int maxSize;
    private String name;
    public Consumer(Queue<Object> store, int maxSize, String name) {
        this.store = store;
        this.maxSize = maxSize;
        this.name = name;
    }
    @Override
    public void run() {
        while(true) {
            synchronized (store) {
                if(!store.isEmpty()) {
                    System.out.println(this.name+" Removed a new Element "+store.size());
                    store.remove();
                }
            }
        }
    }
}

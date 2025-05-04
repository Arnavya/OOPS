package lld1.executor_callable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(10);
        for(int i=0;i<100;i++){
            Runnable r = new NumberPrinter(i);
            es.execute(r);
        }
        es.close();
    }
}

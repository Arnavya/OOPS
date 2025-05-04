package lld1.executor_callable.merge_sort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> list = List.of(6,5,1,9,8,10,3,2,4,7);
        ExecutorService es = Executors.newFixedThreadPool(10);
        Callable<List<Integer>> task = new MergeSorter(list,es);//Create the task
        Future<List<Integer>> futureSortedList = es.submit(task);
        System.out.println(futureSortedList.get());
    }
}

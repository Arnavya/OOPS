package lld1.executor_callable.merge_sort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class MergeSorter implements Callable<List<Integer>> {
    List<Integer> listToSort;
    ExecutorService es;
    public MergeSorter(List<Integer> list,ExecutorService es) {
        this.listToSort = list;
        this.es = es;
    }

    public MergeSorter(int[] arr, int i, int i1) {
    }

    @Override
    public List<Integer> call() throws Exception {
        if(listToSort.size()<=1){
            return listToSort;
        }
        int mid = listToSort.size()/2;
        List<Integer> leftList = listToSort.subList(0,mid);
        List<Integer> rightList = listToSort.subList(mid,listToSort.size());
        Callable<List<Integer>> leftTask = new MergeSorter(leftList,es);
        Callable<List<Integer>> rightTask = new MergeSorter(rightList,es);
        Future<List<Integer>> leftFuture = es.submit(leftTask);
        Future<List<Integer>> rightFuture = es.submit(rightTask);
        List<Integer> sortedList = new ArrayList<>();
        List<Integer> leftSorted = leftFuture.get();
        List<Integer> rightSorted = rightFuture.get();
        int i=0,j=0;
        while(i<leftSorted.size() && j<rightSorted.size()){
            if(leftSorted.get(i)<rightSorted.get(j)){
                sortedList.add(leftSorted.get(i++));
            }
            else{
                sortedList.add(rightSorted.get(j++));
            }
        }
        while(i<leftSorted.size()){
            sortedList.add(leftSorted.get(i++));
        }
        while(j<rightSorted.size()){
            sortedList.add(rightSorted.get(j++));
        }
        return sortedList;
    }
}

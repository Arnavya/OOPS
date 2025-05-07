package lld1.AtomicDataTypes;

public class Subtractor implements Runnable{
    Count count;
    public Subtractor(Count count){
        this.count = count;
    }
    @Override
    public void run() {
        for(int i=1;i<=100;i++){
            count.value.addAndGet(-i);
        }
    }
}

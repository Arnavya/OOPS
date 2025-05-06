package lld1.synchronization.adderSubtractorSynchronizedMethod;

public class Count {
    private int val;
    public synchronized void increment(int offset){
        val+=offset;
    }
    public int getVal(){
        return val;
    }
}

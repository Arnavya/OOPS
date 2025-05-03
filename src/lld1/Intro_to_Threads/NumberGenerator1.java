package lld1.Intro_to_Threads;

public class NumberGenerator1 implements Runnable{
    int n;
    public NumberGenerator1(int n){
        this.n = n;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() +" "+n);
    }
}

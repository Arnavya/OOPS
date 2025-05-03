package lld1.Intro_to_Threads;

public class NumberGenerator2 extends Thread{
    int n;
    public NumberGenerator2(int n){
        this.n = n;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " " + n);
    }
}

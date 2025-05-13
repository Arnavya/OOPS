package lld1.Lambdas.LambdaExample;

public class Main {
    public static void main(String[] args) {
        //V1
        //I have to create a separate class SomethingDoer for this.
        SomethingDoer v1 = new SomethingDoer();
        Thread t1 = new Thread(v1);
        t1.start();

        //V2
        Runnable v2 = () -> {
            System.out.println("Doing something V2");
        };
        Thread t2 = new Thread(v2);
        t2.start();

        //V3
        Thread t3 = new Thread(
                () -> {
                    System.out.println("Doing something V3");
                }
        );
        t3.start();
    }
}

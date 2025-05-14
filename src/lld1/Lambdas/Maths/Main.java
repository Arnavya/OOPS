package lld1.Lambdas.Maths;

public class Main {
    public static void main(String[] args) {

        //V1
        //Creating a separate class -> then creating an object of that class -> calling the method of that class.
        MathematicalOperation sum = new Adder();
        System.out.println(sum.operate(2,2));

        //V2
        //Writing a Lambda expression
        MathematicalOperation addition = (a, b) -> {
            return a + b;
        };
        MathematicalOperation subtraction = (a,b) -> {
            return a - b;
        };
        System.out.println(addition.operate(4,2));
        System.out.println(subtraction.operate(2,2));
    }
}

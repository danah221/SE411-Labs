package lab2.generics;

@FunctionalInterface
interface SqrtOperation {
    double sqrt(double x);
}

public class Q11_Sqrt {
    public static void main(String[] args) {

        SqrtOperation squareRoot = x -> Math.sqrt(x);

        double n = 81.0;
        System.out.println("Square root of " + n + " = " + squareRoot.sqrt(n));
    }
}

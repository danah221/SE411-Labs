package lab2.generics;

@FunctionalInterface
interface DoubleOperation {
    double operate(double a, double b);
}

public class Q10_DivMul {
    public static void main(String[] args) {

        DoubleOperation divide = (a, b) -> a / b;
        DoubleOperation multiply = (a, b) -> a * b;

        double x = 20.0, y = 4.0;

        System.out.println("Division: " + divide.operate(x, y));
        System.out.println("Multiplication: " + multiply.operate(x, y));
    }
}

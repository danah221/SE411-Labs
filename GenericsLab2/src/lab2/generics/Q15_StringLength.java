package lab2.generics;

import java.util.function.Function;

public class Q15_StringLength {
    public static void main(String[] args) {

        Function<String, Integer> charCount = s -> s.length();

        String text = "Software Engineering";
        System.out.println("Length = " + charCount.apply(text));
    }
}

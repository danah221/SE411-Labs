package lab.generics;

import java.util.Arrays;
import java.util.List;

public class App {

    public static void printList(List<?> list) {
        for (Object item : list) {
            System.out.println(item);
        }
    }

    public static double sumNumbers(List<? extends Number> list) {
        double sum = 0;
        for (Number n : list) {
            sum += n.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {

        String[] names = {"Abeer", "Lamia", "Reem"};
        PrintableList<String> p1 = new PrintableList<>(names);
        p1.printAll();

        Integer[] nums = {1, 2, 3};
        PrintableList<Integer> p2 = new PrintableList<>(nums);
        p2.printAll();

        NumberBox<Integer> box = new NumberBox<>();
        box.setItem(10);
        System.out.println(box.add(5));

        printList(Arrays.asList("A", "B", "C"));
        System.out.println(sumNumbers(Arrays.asList(1, 2, 3)));
    }
}

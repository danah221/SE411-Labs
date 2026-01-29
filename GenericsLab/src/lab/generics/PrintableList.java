package lab.generics;

import java.util.Arrays;
import java.util.List;

public class PrintableList<T> {

    private List<T> list;

    public PrintableList(T[] items) {
        this.list = Arrays.asList(items);
    }

    public void printAll() {
        for (T item : list) {
            System.out.println(item);
        }
    }
}
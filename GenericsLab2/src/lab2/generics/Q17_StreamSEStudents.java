package lab2.generics;

import java.util.Arrays;
import java.util.List;

public class Q17_StreamSEStudents {

    // Method that stores student data in one String separated by commas
    public static String studentInfo(String id, String major, String name) {
        return id + "," + major + "," + name;
    }

    public static void main(String[] args) {

        List<String> students = Arrays.asList(
                studentInfo("2021001", "Software Engineering", "Abeer"),
                studentInfo("2021002", "Cyber Security", "Lama"),
                studentInfo("2021003", "Software Engineering", "Reem"),
                studentInfo("2021004", "Information Systems", "Sara")
        );

        students.stream()
                .filter(s -> s.split(",")[1].trim().equalsIgnoreCase("Software Engineering"))
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}

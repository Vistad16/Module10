package javaCore.module10.task2;

import java.util.Arrays;
import java.util.List;

public class SortUpperTest {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Bill", "Summer", "Monica", "Carl", "Zigrid");

        SortUpper sortUpper = new SortUpper();
        System.out.println(sortUpper.sortToUpperCase(names));
    }
}

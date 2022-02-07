package javaCore.module10.task1;

import java.util.Arrays;
import java.util.List;

public class OddNamesTest {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Bill", "Summer", "Monica", "Carl", "Zigrid");

        OddNames oddNames = new OddNames();
        System.out.println(oddNames.odd(names));

    }
}

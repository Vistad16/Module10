package javaCore.module10.task3;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayNumbers {
    public static void main(String[] args) {
        String[] source = new String[]{"1, 2, 0", "4, 5", "3, 7, 6"};

        String collect = Arrays.stream(source)
                .flatMap(a -> Arrays.stream(a.split(","))) //split arrays
                .map(s -> s.strip()) // delete spaces
                .sorted()
                .collect(Collectors.joining(", ")); //use joiner for delimiter between numbers
        System.out.println("\"" + collect + "\""); //add "
    }
}
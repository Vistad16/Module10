package javaCore.module10.task2;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class SortUpper {
    //first version
    /*public List<String> sortToUpperCase(List<String> names){
        Stream<String> sortUpper = names
                .stream()
                .map(name -> name.toUpperCase())
                .sorted(Comparator.reverseOrder());

        List<String> result = sortUpper.collect(Collectors.toList());
        return result;
    }*/

    //new version
    public List<String> sortToUpperCase(final List<String> names){
        Stream<String> sortUpper = names.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder());

        return sortUpper.collect(Collectors.toList());
    }


}

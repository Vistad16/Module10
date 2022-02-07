package javaCore.module10.task1;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class OddNames {

    public List<String> odd(final List<String> names) {
        AtomicInteger atomicInteger = new AtomicInteger(0);//try atomic integer
        //final int[] i = {1}; //bad practice

        Stream<String> namesOdd = names.stream()
                .map(name -> {
                    int andIncrement = atomicInteger.getAndIncrement();
                    if (andIncrement % 2 != 0) { //add numbers only to odd names
                        name = andIncrement + "." + name; //add "."
                    }
                    //i[0]++;
                    return name;
                })
                .filter(name -> name.contains(".")); //take all names with "."

        //List<String> result = namesOdd.collect(Collectors.toList());

        return namesOdd.collect(Collectors.toList());

    }

}
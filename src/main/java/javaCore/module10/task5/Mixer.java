package javaCore.module10.task5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Mixer {

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second){
        List<T> result = new ArrayList<>();

        Iterator<T> firstIterator = first.iterator();
        Iterator<T> secondIterator = second.iterator();

        //add value
        while (firstIterator.hasNext() && secondIterator.hasNext()){
            result.add(firstIterator.next());
            result.add(secondIterator.next());
        }

        return result.stream();//List to stream
    }

}

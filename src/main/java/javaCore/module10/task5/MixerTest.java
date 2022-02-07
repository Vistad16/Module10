package javaCore.module10.task5;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MixerTest {
    public static void main(String[] args) {
        Mixer mixer = new Mixer();

        Stream<String> first = Stream.of("Aragorn", "Gimli", "Legolas", "Gendalf", "Boromir");//Shon Bin always die
        Stream<String> second = Stream.of("1", "2", "3", "4");

        Stream<String> result = mixer.zip(first, second);
        result.peek(System.out::println).collect(Collectors.toList());
    }
}

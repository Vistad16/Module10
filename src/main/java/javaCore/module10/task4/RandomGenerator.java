package javaCore.module10.task4;

import java.util.stream.Stream;

class RandomGenerator {

    public Stream<Long> next(long a, long c, long m){

        return Stream.iterate(16L, x -> (a * x + c) % m);
    }


}

package javaCore.module10.task4;

public class RandomGeneratorTest {
    public static void main(String[] args) {
        RandomGenerator randomGenerator = new RandomGenerator();
        randomGenerator.next(25214903917L, 11L, 2 ^ 48L)
                .limit(5)
                    .peek(System.out::println)
                        .count();


    }
}
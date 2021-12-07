import java.util.Scanner;
import java.util.function.BiPredicate;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BiPredicate<int[], IntPredicate> isOrdered = (numbers, order) ->
                IntStream.range(0, numbers.length - 1).allMatch(order);

        int[] numbers = IntStream.generate(scanner::nextInt)
                .takeWhile(i -> i != 0)
                .toArray();

        boolean ascending = isOrdered.test(numbers, i -> numbers[i] <= numbers[i + 1]);
        boolean descending = isOrdered.test(numbers, i -> numbers[i] >= numbers[i + 1]);

        System.out.println(ascending || descending);
    }
}

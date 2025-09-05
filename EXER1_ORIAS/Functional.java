import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Functional {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        // Define functions
        Predicate<Integer> isEven = n -> n % 2 == 0;
        Function<Integer, Integer> doubleIt = n -> n * 2;

        // Compose the functions using streams
        List<Integer> result = numbers.stream()
                .filter(isEven)
                .map(doubleIt)
                .collect(Collectors.toList());

        // Output the results
        result.forEach(System.out::println);
    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Imperative {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> result = new ArrayList<>();

        for (Integer number : numbers) {
            if (number % 2 == 0) {
                result.add(number * 2);
            }
        }

        for (Integer number : result) {
            System.out.println(number);
        }
    }
}

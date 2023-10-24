package A1024;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex04 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry");
        String result = words.stream()
            .map(String::toUpperCase)
            .collect(Collectors.joining(", "));

            System.out.println(result);

    }
}

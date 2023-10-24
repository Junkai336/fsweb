package A1024;

import java.util.Arrays;
import java.util.List;

public class Ex05 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "aaaaaa");
        long count = words.stream()
            .filter(word -> word.contains("a"))
            .count();

            System.out.println(count);
    }
}

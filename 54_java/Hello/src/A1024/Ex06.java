package A1024;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex06 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "fig");
        List<String> filteredStrings = strings.stream()
                .filter(s -> s.length() <= 3)
                .collect(Collectors.toList());

        System.out.println(filteredStrings);
    }
}

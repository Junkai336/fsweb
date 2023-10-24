package A1024;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex02 {
    public static void main(String[] args) {
        // 배열 리스트에서 길이가 5 이상인 문자열만 선택하는 Java 스트림 코드를 작성하십시오.

        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
        
        List<String> fiveLength = words.stream()
            .filter(word -> word.length() >= 5)
            .collect(Collectors.toList());

        System.out.println(fiveLength);
    }
}

package A1024;

import java.util.Arrays;
import java.util.List;

// 문자열목록에서문자열길이평균구하기
public class Ex09 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "fig");

        double averageLength = strings.stream()
            .mapToInt(String::length) // 문자열 길이를 숫자로 매핑
            .average() // 평균
            .orElse(0.0); // 목록이 비어있으면 0.0

            System.out.println(averageLength);

            // orElse : 기본값을 지정하여 안전하게 값을 가져옴
            // getAsDouble : 값이 반드시 존재해야 하는 경우에 사용되어야 함.
    }
}

package A1023;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
        public static void main(String[] args) throws IOException {
                Trader raoul = new Trader("Raoul", "Cambridge");
                Trader mario = new Trader("Mario", "Milan");
                Trader alan = new Trader("Alan", "Cambridge");
                Trader brian = new Trader("Brian", "Cambridge");

                List<Transaction> transactions = Arrays.asList(
                                new Transaction(brian, 2011, 300),
                                new Transaction(raoul, 2012, 1000),
                                new Transaction(raoul, 2011, 400),
                                new Transaction(mario, 2012, 710),
                                new Transaction(mario, 2012, 700),
                                new Transaction(alan, 2012, 950));
                // 2011 년에 일어난 모든 트랜젝션을 찾아 값을 오름차순으로 정리하시오.

                List<Transaction> transactions2011 = transactions.stream()
                                .filter(transaction -> transaction.getYear() == 2011)
                                .sorted(Comparator.comparing(Transaction::getValue))
                                .collect(Collectors.toList());
                System.out.println(transactions2011);
                System.out.println();

                // 거래자가 근무하는 도시 중복없이 나열하시오.
                List<String> quiz2 = transactions.stream()
                                .map(Transaction::getTrader) // Transaction 에서는 Trader를 추출
                                .map(Trader::getCity) // Trader 도시이름을 추출
                                .distinct()
                                .collect(Collectors.toList());
                System.out.println(quiz2);
                System.out.println();

                List<String> quiz22 = transactions.stream()
                                .map(transaction -> transaction.getTrader().getCity())
                                .distinct()
                                .collect(Collectors.toList());
                System.out.println(quiz22);
                System.out.println();

                // 케임브리지에서 근무하는 모든 거래자를 찾아서 이름순으로 정렬하시오
                List<String> Cambridge_traders = transactions.stream()
                                .map(Transaction::getTrader) // Transaction 객체를 Trader 객체로 변환
                                .filter(s -> s.getCity().equals("Cambridge"))
                                .map(s -> s.getName()) // 각 거래자의 이름만을 추출 (정보를 추출)
                                .distinct()
                                .sorted()
                                .collect(Collectors.toList());
                System.out.println("Cambridge_traders : " + Cambridge_traders);

                List<String> quiz3 = transactions.stream()
                                .filter(transaction -> "Cambridge".equals(transaction.getTrader().getCity()))
                                .map(transaction -> transaction.getTrader().getName())
                                .distinct()
                                .sorted()
                                .collect(Collectors.toList());
                quiz3.forEach(n -> System.out.println(n.toString()));

                // 모든 거래자의 이름을 알파벳순으로 정리해서 반환하시오

                String quiz4 = transactions.stream()
                                .map(transaction -> transaction.getTrader().getName())
                                .sorted()
                                .distinct()
                                .reduce("", (s, s2) -> s + s2 + " ");
                System.out.println(quiz4);

                List<String> quiz4_1 = transactions.stream()
                                .map(transaction -> transaction.getTrader().getName())
                                .distinct()
                                .sorted()
                                .collect(Collectors.toList());
                quiz4_1.forEach(System.out::println);

                // 밀라노에 거래자가 있는가?

                boolean quiz5 = transactions.stream()
                                .anyMatch(transaction -> "Milan".equals(transaction.getTrader().getCity()));
                System.out.println(quiz5);

                boolean milanTraderExists = transactions.stream()
                                .anyMatch(transaction -> transaction.getTrader().getCity().equals("Milan"));
                System.out.println(milanTraderExists);
                // 케임브리지에 거주하는 거래자의 모든 트랜잭션값을 출력하시오

                // 전체 트랜잭션 중 최댓값은 얼마인가?

                Integer quiz7 = transactions.stream()
                                .mapToInt(asd -> asd.getValue())
                                .max()
                                .orElseThrow(NoSuchElementException::new);

                System.out.println(quiz7);

                Optional<Integer> maxValue = transactions.stream()
                                .mapToInt(Transaction::getValue)
                                .boxed()
                                .max(Integer::compare);
                System.out.println("최대값 : " + maxValue.toString().replaceAll("[^0-9]", ""));

                int max1 = transactions.stream()
                                .map(Transaction::getValue)
                                .max(Integer::compareTo)
                                .orElse(0);
                System.out.println("M<ax Transaction Value: " + max1);

                Optional<Integer> quiz77 = Optional
                                .ofNullable(transactions.stream().map(transaction -> transaction.getValue()).reduce(0,
                                                (integer, integer2) -> Integer.max(integer, integer2)));

                System.out.println(quiz77);

                List<Transaction> transactions1 = new ArrayList<>();
                Optional<Integer> quiz7_1 = Optional
                                .ofNullable(transactions1.stream().map(transaction -> transaction.getValue()).reduce(0,
                                                (integer, integer2) -> Integer.max(integer, integer2)));

                System.out.println(quiz7_1);

                // 전체 트랜잭션 중 최솟값은 얼마인가?

                Integer quiz8 = transactions.stream()
                                .mapToInt(asd -> asd.getValue())
                                .min()
                                .orElseThrow(NoSuchElementException::new);

                System.out.println(quiz8);

        }
}
/*
 * map은 Java 스트림에서 요소를 변환하거나 매핑하는 데 사용되는 중요한 연산자 중 하나입니다. map 연산자는 스트림 내의 각 요소를
 * 새로운 값으로 변환하거나 특정 함수 또는 매핑 작업을 적용하는 데 사용됩니다. 다음은 map을 사용하는 일반적인 상황과 용도입니다:
 * 
 * 요소 변환: 스트림 내의 요소를 다른 형태로 변환할 때 map을 사용합니다. 예를 들어, 숫자 리스트에서 각 숫자를 제곱하는 경우:
 * 
 * java
 * Copy code
 * List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
 * List<Integer> squaredNumbers = numbers.stream()
 * .map(n -> n * n)
 * .collect(Collectors.toList());
 * 특정 속성 추출: 객체 목록에서 특정 속성을 추출하여 새로운 목록을 생성할 때 map을 사용합니다. 이는 객체에서 원하는 정보를 추출할 때
 * 유용합니다.
 * 
 * java
 * Copy code
 * List<Person> people = ... // 어떤 객체 목록
 * List<String> names = people.stream()
 * .map(Person::getName) // Person 객체에서 이름 추출
 * .collect(Collectors.toList());
 * 객체 변환: 객체를 다른 형식으로 변환하거나 특정 필드를 업데이트할 때 map을 사용합니다. 예를 들어, 날짜를 포맷팅하거나 필드를
 * 수정하는 경우:
 * 
 * java
 * Copy code
 * List<Event> events = ... // 어떤 이벤트 목록
 * List<String> eventNames = events.stream()
 * .map(event -> {
 * event.setDescription(event.getDescription().toUpperCase()); // 설명을 대문자로 변경
 * return event;
 * })
 * .map(Event::getName) // Event 객체를 이름 문자열로 변환
 * .collect(Collectors.toList());
 * Optional 값을 추출: map은 Optional 객체 내에서 값을 추출할 때도 사용됩니다. 이것은 Optional을 통해 안전하게
 * 값에 접근하는 데 도움이 됩니다.
 * 
 * java
 * Copy code
 * Optional<String> optionalValue = ... // 어떤 Optional
 * Optional<Integer> mappedValue = optionalValue.map(Integer::parseInt);
 * 스트림 평면화: map은 스트림의 요소를 다른 스트림으로 매핑하는 데 사용되며, 이를 통해 스트림을 평면화할 수 있습니다. 이것은 스트림의
 * 중첩 구조를 해제하거나 평탄화할 때 유용합니다.
 * 
 * java
 * Copy code
 * List<List<Integer>> nestedLists = ... // 중첩 리스트
 * List<Integer> flatList = nestedLists.stream()
 * .flatMap(List::stream) // 중첩 리스트를 평탄화
 * .collect(Collectors.toList());
 * map은 스트림 파이프라인에서 유용한 연산자 중 하나이며, 데이터 변환 및 가공을 위해 많은 상황에서 활용됩니다.
 * 
 */
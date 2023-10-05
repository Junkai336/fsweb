package A1004;

public class ch3question {
    public static void main(String[] args) {
        // 2.
    //     String grade = "B";

    //     int score = switch (grade) {
    //     case "A" -> 100;
    //     case "B" -> {
    //     int result = 100 - 20;
    //     yield result;
    //     }
    //     default -> 60;
    //     };
    //     System.out.println(score);
    //    }

        // 3.
        int i = 1;
        int sum = 0;

        for (i = 1; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
                // i++;
                sum += i;
            }
        }
        System.out.println(sum);

        // 4.
        boolean run = true;
        int num1 = 0;
        int num2 = 0;

        while (run) {
            num1 = (int) (Math.random() * 6) + 1;
            num2 = (int) (Math.random() * 6) + 1;
            System.out.println(num1 + " , " + num2);

            if (num1 + num2 == 5) {
                run = false;
            }
        }

        // 5. 해: 해결, 풀이, 답 . 방정식에서 풀어서 구한 미지수의 값

        for (int x = 1; x <= 10; x++) {
            for (int y = 1; y <= 10; y++) {
                if ((4 * x) + (5 * y) == 60) {
                    System.out.println("( x값: " + x + ", y값: " + y + ")");
                }
            }
        }

        // 6.
        int star = 1;
        for (star = 1; star <= 5; star++) {
            if (star == 1)
                System.out.println("*");
            if (star == 2)
                System.out.println("**");
            if (star == 3)
                System.out.println("***");
            if (star == 4)
                System.out.println("****");
            if (star == 5)
                System.out.println("*****");
        }

    }}
package A1006;

public class A1006_4 {
    public static void main(String[] args) {

        // 배열 변수 선언과 배열 생성
        int[] scores = { 95, 71, 84, 93, 87 };

        // 배열 항목 전체 합 구하기
        int sum = 0;
        
        // 5개의 항목이 한 번씩 score 변수에 저장되고 sum에 누적됨 (반복 횟수: 5)
        // 향상된 for 문
        for (int score : scores) {
            sum = sum + score;
        }

        System.out.println("점수 총합 = " + sum);

        // 배열 항목 전체 평균 구하기
        double avg = (double) sum / scores.length;
        System.out.println("점수 평균 = " + avg);
    }
}

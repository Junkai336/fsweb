package A1007;

import java.util.Scanner;

public class BookTest2 {
    public static void main(String[] args) {
        // 9. 학생들의 점수를 분석하는 프로그램을 만드려고 합니다. 키보드로부터 학생 수와 각 학생들의 점수를 입력받고 while문과
        // Scanner의 nextLine() 메소드를 이용해서 최고 점수 및 평균 점수를 출력하는 코드를 작성해보세요

        Scanner scan = new Scanner(System.in);
    
        Boolean run = true;

        int[] scores = new int[3];
        int maxScore = 0;
        int highestScore = 0;


        while (run) {
            
            System.out.println("-------------------------------------------");
            System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
            System.out.println("-------------------------------------------");
            System.out.print("선택");

            String input = scan.nextLine();
            
            switch (input) {
                case "1":
                System.out.println("학생수>" + scores.length);
                break;
                
                case "2":
                System.out.print("학생1 점수>");
                scores[0] = scan.nextInt();
                System.out.print("학생2 점수>");
                scores[1] = scan.nextInt();
                System.out.print("학생3 점수>");
                scores[2] = scan.nextInt();
                break;
                // 이거 끝나면 왜 선택 두번 출력???

                case "3":
                System.out.println("scores[0]: " + scores[0]);
                System.out.println("scores[1]: " + scores[1]);
                System.out.println("scores[2]: " + scores[2]);
                break;

                case "4":
                for(int i=0; i<scores.length; i++) {
                    maxScore += scores[i];
                    if (highestScore < scores[i]) {
                        highestScore = scores[i];
                    }
                }

                System.out.println("최고 점수: " + highestScore);
                System.out.println("평균 점수: " + (maxScore / scores.length));

                maxScore = 0;
                highestScore = 0;
                break;

                case "5":
                System.out.println("시스템을 종료합니다.");
                run = false;
                scan.close();
                break;
                
                
            }
        }

    }
}

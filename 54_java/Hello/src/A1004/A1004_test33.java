package A1004;

import java.util.Scanner;

public class A1004_test33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("날짜 입력: ");
        
        String season = scanner.nextLine();

        switch (season) {
            case "1" :
            case "2" :
            case "12" :
            System.out.println(season + " winter");
            break;
            
            case "3" :
            case "4" :
            case "5" :
            System.out.println(season + " spring");
            break;

            case "6" :
            case "7" :
            case "8" :
            System.out.println(season + " summer");
            break;
            
            case "9" :
            case "10" :
            case "11" :
            System.out.println(season + " summer");
            break;

        }


        scanner.close();
    }
}
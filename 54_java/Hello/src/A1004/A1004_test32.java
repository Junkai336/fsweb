package A1004;

import java.util.Scanner;

public class A1004_test32 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String score = scanner.nextLine();

        switch(score) {
            case "A" : 
            case "a" :
            System.out.println("best!!!");
            break;
            case "B" :
            case "b" :
            System.out.println("good!!");
            break;
            case "C" :
            case "c" :
            System.out.println("run!");
            break;
            case "D" :
            case "d" :
            System.out.println("slowly~");
            break;
            default :
            System.out.println("What?");
            break;
        }
    }
}

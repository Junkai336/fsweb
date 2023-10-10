package A1004;

import java.util.Scanner;

public class A1004_test32_teacher {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        char ch = scan.next().charAt(0);

        switch(ch) {
            case 'A': 
                System.out.println("best");
                break;
            case 'B':
                System.out.println("good");
                break;
            case 'C':
                System.out.println("normal");
                break;
            case 'D':
                System.out.println("bad");
                break;
            default:
                System.out.println("what?");
                break;
        }

    }
}

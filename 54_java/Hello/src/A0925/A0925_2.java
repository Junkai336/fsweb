package A0925;

import java.util.Arrays;
import java.util.Scanner;

public class A0925_2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int array[] = new int[31];

		for(int i=1; i<=28; i++) {
			array[sc.nextInt()] = 1;
		}

		for(int i=1; i<=30; i++) {
			if(array[i] != 1) {
				System.out.println(i);
			}
		}
	}
}

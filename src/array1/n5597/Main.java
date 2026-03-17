package array1.n5597;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] num = new int[30];
		for(int i = 0 ; i < 30 ; i++ ) {
			num[i] = 1;
		}
		
		for (int i = 0; i < 28; i++) {
			int temp = scanner.nextInt()-1;
			num[temp] = 0;
		}
		
		for (int i = 0; i < 30; i++) {
			if (num[i] == 1) {
				System.out.println(i+1);
			}
		}
		
	}

}

package array1.n3052;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int cnt = 10;
		
		int[] num = new int[10];
		
		for (int i = 0 ; i < 10 ; i++ ) {
			int temp = scanner.nextInt();
			num[i] = temp % 42;
		}
		
		for (int i = 1 ; i < 10 ; i++) {
			for (int j = 0 ; j < i ; j++) {
				if (num[i] == num[j]) {
					cnt--;
					break;
				}
			}
		}
		
		System.out.println(cnt);
	}

}

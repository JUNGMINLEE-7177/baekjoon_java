package array1.n2562;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] num = new int[9];
		int max = 0;
		int cnt = 0;
		
		for (int i = 0; i < 9; i++) {
			num[i] = scanner.nextInt();
			if (num[i] > max) {
				max = num[i];
				cnt = i;
			}
		}
		
		System.out.println(max);
		System.out.println(cnt+1);
	}

}

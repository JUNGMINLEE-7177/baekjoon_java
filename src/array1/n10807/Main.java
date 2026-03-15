package array1.n10807;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		
		int[] num = new int[N];
		
		for (int i = 0; i < N; i++) {
			num[i] = scanner.nextInt();
		}
		
		int v = scanner.nextInt();
		int result = 0;
		
		for (int i = 0; i < N; i++) {
			if (num[i] == v) {
				result++;
			}
		}
		
		System.out.println(result);
		
	}

}

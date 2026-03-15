package array1.n10810;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		
		int[] num = new int[N];
		
		for (int i=0; i<M; i++) {
			int min = scanner.nextInt();
			int max = scanner.nextInt();
			int temp = scanner.nextInt();
			
			for (int x = 0; x < max - min + 1; x++) {
				num[min+x-1] = temp;
			}
		}
		
		for (int i = 0; i < N; i++) {
			System.out.print(num[i]+" ");
		}
	}

}

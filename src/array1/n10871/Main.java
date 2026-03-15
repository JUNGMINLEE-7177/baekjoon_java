package array1.n10871;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		int X = scanner.nextInt();
		
		int[] num = new int[N];
		int cnt = 0;
		
		for (int i = 0; i < N ; i++) {
			int temp = scanner.nextInt();
			if (temp < X) {
				num[cnt++] = temp;
			}
		}
		
		for (int i = 0; i < cnt ; i++) {
			System.out.print(num[i]+" ");
		}
	}

}

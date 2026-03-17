package array1.n10811;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		int[] num = new int[N];
		
		for (int cnt = 0; cnt < N ; cnt++) {
			num[cnt] = cnt+1;
		}
		
		for (int cnt = 0; cnt < M ; cnt++) {
			int i = scanner.nextInt()-1;
			int j = scanner.nextInt()-1;
			for ( int cnt1 = 0; cnt1 < (j-i+1)/2; cnt1++) {
				int temp = num[i+cnt1];
				num[i+cnt1] = num[j-cnt1];
				num[j-cnt1] = temp;
			}
		}
		
		for (int cnt = 0; cnt < N ; cnt++) {
			System.out.print(num[cnt]+" ");
		}
	}

}

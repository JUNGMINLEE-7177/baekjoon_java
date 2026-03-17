package array1.n10813;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		
		int[] num = new int[N];
		for (int cnt=0; cnt<N; cnt++) {
			num[cnt] = cnt+1;
		}
		
		for (int cnt=0; cnt<M; cnt++) {
			int i = scanner.nextInt()-1;
			int j = scanner.nextInt()-1;
			
			int temp = num[i];
			num[i] = num[j];
			num[j]= temp;
			
		}
		
		for (int cnt=0; cnt<N; cnt++) {
			System.out.print(num[cnt]+" ");
		}
		
	}

}

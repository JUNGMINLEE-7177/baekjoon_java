package array1.n1546;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		float[] num = new float[N];
		float max = 0;

		
		for (int i =0; i < N; i++) {
			num[i] = scanner.nextInt();
			if(num[i] > max) {
				max = num[i];
			}
		}
		
		for (int i = 0; i < N ; i++) {
			num[i] = num[i]/max*100;
		}
		
		float sum = 0;
		float result = 0;
		
		for (int i = 0; i < N ; i++) {
			sum += num[i];
		}
		
		result = sum/N;
		System.out.println(result);
	}

}

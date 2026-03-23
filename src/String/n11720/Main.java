package String.n11720;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		scanner.nextLine();
		String word = scanner.nextLine();
		int result = 0;
		
		for (int i=0; i<N; i++) {
			result += (int)word.charAt(i)-48;
		}
		System.out.println(result);
	}

}

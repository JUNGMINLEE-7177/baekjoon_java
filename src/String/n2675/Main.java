package String.n2675;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int T = scanner.nextInt();
		
		for (int i=0; i<T; i++) {
			int R = scanner.nextInt();
			String word = scanner.next();
			
			for (int j=0; j<word.length(); j++) {
				for (int k=0; k<R; k++) {
					System.out.print(word.charAt(j));
				}
			}
			System.out.println();
		}
	}

}

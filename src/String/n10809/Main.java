package String.n10809;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String word = scanner.nextLine();
		
		for (int i=97; i<=122;i++) {
			for (int num=0; num<word.length();num++) {
				if (i == word.charAt(num)) {
					System.out.print(num + " ");
					break;
				}
				if ( num == word.length()-1) {
					System.out.print(-1 + " ");
				}
			}
		}
	}

}

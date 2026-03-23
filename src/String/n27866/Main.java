package String.n27866;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String word = scanner.nextLine();
		int number = scanner.nextInt();
		
		char result = word.charAt(number-1);
		
		System.out.println(result);
	}

}

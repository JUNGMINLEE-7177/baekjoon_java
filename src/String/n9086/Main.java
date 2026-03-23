package String.n9086;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int number = scanner.nextInt();
		scanner.nextLine();
		String[] result = new String[number];
		
		
		for ( int i = 0 ; i < number ; i++) {
			String word = scanner.nextLine();
			char first = word.charAt(0);
			char last = word.charAt(word.length()-1);
			result[i] = "" + first + last;
		}
		
		for (int i = 0 ; i < number ; i++) {
			System.out.println(result[i]);
		}
		
		
		
	}

}

package conditional.n1330;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		long A = scanner.nextLong();
		long B = scanner.nextLong();
		
		if (A > B) {
			System.out.println(">");
		}
		else if (A == B) {
			System.out.println("==");
		}
		else {
			System.out.println("<");
		}

	}

}

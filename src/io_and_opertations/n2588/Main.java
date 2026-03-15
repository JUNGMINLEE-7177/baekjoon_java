package io_and_opertations.n2588;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int A = scanner.nextInt();
		String strB = scanner.next();
		
		int B = Integer.parseInt(strB);
		char strB1 = strB.charAt(0);
		char strB2 = strB.charAt(1);
		char strB3 = strB.charAt(2);
		
		int B1 = strB1-48;
		int B2 = strB2-48;
		int B3 = strB3-48;
		
		int result1 = B3 * A;
		int result2 = B2 * A;
		int result3 = B1 * A;
		int result4 = A * B;
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		
	}

}
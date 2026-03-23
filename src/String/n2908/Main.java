package String.n2908;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String old_A = scanner.next();
		String old_B = scanner.next();
		int new_A=0;
		int new_B=0;
		
		for (int i=0; i<3; i++) {
			new_A += (int)(old_A.charAt(i)-48)*(Math.pow(10, i));
		}
		
		for (int i=0; i<3; i++) {
			new_B += (int)(old_B.charAt(i)-48)*(Math.pow(10, i));
		}
		
		if (new_A > new_B) {
			System.out.println(new_A);
		}
		else System.out.println(new_B);

			

	}

}

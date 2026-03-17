package String.n1152;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String sentence = scanner.nextLine();
		int length = sentence.length();
		int cnt=1;
		int first = 0;
		int last = 0;
		
		for (int i=0; i < length; i++) {
			char check_blank = sentence.charAt(i);
			if (check_blank != ' ') {
				first = i;
				break;
			}
		}
		
		for (int i=0; i < length; i++) {
			char check_blank = sentence.charAt(length-i-1);
			if (check_blank != ' ') {
				last = length-i;
				break;
			}
		}
		
		if (first == last) {
			System.out.println(0);
			return;
		}
		
		for (int i = first; i < last; i++) {
			char check_blank = sentence.charAt(i);
			if( check_blank == ' ') {
				cnt++;
			}
		}
		
		System.out.println(cnt);
		
	}

}

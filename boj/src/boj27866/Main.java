package boj27866;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		String s = scanner.next();
		int i = scanner.nextInt();
		scanner.close();
		
		System.out.println(s.charAt(i-1));
	}

}

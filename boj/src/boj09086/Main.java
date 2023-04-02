package boj09086;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int t = scanner.nextInt();
		
		for(int i = 0; i < t; i++) {
			String s = scanner.next();
			System.out.print(s.charAt(0));
			System.out.print(s.charAt(s.length()-1));
			System.out.println();
		}
		scanner.close();
	}

}

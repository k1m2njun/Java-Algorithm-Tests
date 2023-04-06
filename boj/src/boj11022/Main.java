package boj11022;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int a;
		int b;
		
		for(int i = 0; i < t; i++) {
			a = scanner.nextInt();
			b = scanner.nextInt();
			System.out.printf("Case #%d: %d + %d = %d\n", i+1, a, b, a+b);
		}
		scanner.close();
	}

}

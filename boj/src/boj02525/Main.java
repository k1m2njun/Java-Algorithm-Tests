package boj02525;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		scanner.close();
		
		int m = b + c;
		
		if(m >= 60) {
			a += m / 60;
			m = m % 60;
			if(a > 23) {
				a -= 24;
			}
		}
		System.out.println(a + " " + m);
	}
}
